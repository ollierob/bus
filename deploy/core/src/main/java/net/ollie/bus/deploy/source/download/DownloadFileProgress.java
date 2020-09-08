package net.ollie.bus.deploy.source.download;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public interface DownloadFileProgress extends DownloadProgress {

    @Override
    CompletableFuture<? extends DeploymentFile> future();

    static DownloadFileProgress async(final Supplier<DeploymentFile> supplier) {
        final var future = CompletableFuture.supplyAsync(supplier);
        return new DownloadFileProgress() {

            @Override
            public CompletableFuture<? extends DeploymentFile> future() {
                return future;
            }

            @Override
            public int progress() {
                return future.isDone() ? 100 : 0;
            }
        };
    }

}
