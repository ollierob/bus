package net.ollie.bus.deploy.source.build.gitlab;

import net.ollie.bus.deploy.DeploymentFiles;
import net.ollie.bus.deploy.source.GetProgress;
import net.ollie.bus.deploy.source.download.DownloadProgress;
import net.ollie.bus.deploy.source.download.DownloadSource;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

class GitlabBuildProgress implements GetProgress {

    static final Duration POLL_FREQUENCY = Duration.ofSeconds(5);

    static GetProgress of(
            final GitlabPipelineStatus initial,
            final Supplier<GitlabPipelineStatus> poll,
            final ScheduledExecutorService executor,
            final DownloadSource next) {
        if (initial.isFailed()) return GetProgress.failed(failureReason(initial));
        if (initial.isSuccess()) return next.get();
        final var progress = new GitlabBuildProgress(initial, next);
        progress.submit(poll, executor);
        return progress;
    }

    private static Exception failureReason(final GitlabPipelineStatus status) {
        return new Exception("Build " + status.status());
    }

    private volatile GitlabPipelineStatus latestStatus;
    private final DownloadSource next;
    private final CompletableFuture<DeploymentFiles> future = new CompletableFuture<>();
    private volatile DownloadProgress nextProgress;

    private GitlabBuildProgress(final GitlabPipelineStatus status, final DownloadSource next) {
        this.latestStatus = status;
        this.next = next;
    }

    void submit(final Supplier<GitlabPipelineStatus> poll, final ScheduledExecutorService executor) {
        //FIXME avoid recursion
        executor.schedule(() -> {
            //noinspection NonAtomicOperationOnVolatileField
            latestStatus = poll.get();
            if (latestStatus.isSuccess()) this.complete();
            else if (latestStatus.isFailed()) future.completeExceptionally(failureReason(latestStatus));
            else this.submit(poll, executor);
        }, POLL_FREQUENCY.toNanos(), TimeUnit.NANOSECONDS);
    }

    private void complete() {
        nextProgress = next.get();
        nextProgress.future().whenComplete((f, x) -> {
            if (x != null) future.completeExceptionally(x);
            else future.complete(f);
        });
    }

    @Override
    public int progress() {
        return nextProgress == null ? 0 : 50 + (nextProgress.progress() / 2);
    }

    @Override
    public CompletableFuture<? extends DeploymentFiles> future() {
        return future;
    }

}
