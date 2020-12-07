package net.ollie.sandwich.deploy.source;

import net.ollie.sandwich.deploy.DeploymentFiles;
import net.ollie.sandwich.deploy.DeploymentProgress;

import java.util.concurrent.CompletableFuture;

public class ChainedGetProgress implements GetProgress {

    private final CompletableFuture<? extends DeploymentFiles> future;

    public ChainedGetProgress(
            final DeploymentProgress first,
            final DeploymentSource nextSource) {
        this.future = first.future().thenCompose(r -> nextSource.get().future());
    }

    @Override
    public CompletableFuture<? extends DeploymentFiles> future() {
        return future;
    }

}
