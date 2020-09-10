package net.ollie.bus.deploy.target;

import net.ollie.bus.deploy.DeploymentProgress;

import java.util.concurrent.CompletableFuture;

/**
 * @see net.ollie.bus.deploy.source.GetProgress
 */
public interface PutProgress extends DeploymentProgress {

    static PutProgress done() {
        final var future = new CompletableFuture<Void>();
        future.complete(null);
        return new PutProgress() {

            @Override
            public int progress() {
                return 100;
            }

            @Override
            public CompletableFuture<?> future() {
                return future;
            }

        };
    }

}
