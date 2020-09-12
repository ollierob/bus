package net.ollie.bus.deploy.source;

import net.ollie.bus.deploy.DeploymentFiles;
import net.ollie.bus.deploy.DeploymentProgress;

import java.util.concurrent.CompletableFuture;

public class ChainedGetProgress implements GetProgress {

    private final DeploymentProgress first;
    private final CompletableFuture<? extends DeploymentFiles> future;
    private volatile GetProgress next;

    public ChainedGetProgress(
            final DeploymentProgress first,
            final DeploymentSource nextSource) {
        this.first = first;
        this.future = first.future().thenCompose(r -> (next = nextSource.get()).future());
    }

    @Override
    public CompletableFuture<? extends DeploymentFiles> future() {
        return future;
    }

}
