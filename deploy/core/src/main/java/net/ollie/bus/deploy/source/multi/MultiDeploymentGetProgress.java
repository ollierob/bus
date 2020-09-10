package net.ollie.bus.deploy.source.multi;

import net.ollie.bus.deploy.DeploymentFiles;
import net.ollie.bus.deploy.source.GetProgress;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

class MultiDeploymentGetProgress implements GetProgress {

    private final Set<? extends GetProgress> progress;

    MultiDeploymentGetProgress(final Set<? extends GetProgress> progress) {
        this.progress = progress;
    }

    @Override
    public int progress() {
        return progress.stream().mapToInt(GetProgress::progress).sum() / progress.size();
    }

    @Override
    public CompletableFuture<? extends DeploymentFiles> future() {
        var future = CompletableFuture.completedFuture(DeploymentFiles.EMPTY);
        for (final var p : progress) {
            future = future.thenCombine(p.future(), DeploymentFiles::and);
        }
        return future;
    }

}
