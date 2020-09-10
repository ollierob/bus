package net.ollie.bus.deploy;

import java.util.concurrent.CompletableFuture;

public interface DeploymentProgress {

    int progress();

    CompletableFuture<?> future();

    default boolean isDone() {
        return this.future().isDone();
    }

}
