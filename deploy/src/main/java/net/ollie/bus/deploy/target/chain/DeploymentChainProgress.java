package net.ollie.bus.deploy.target.chain;

import net.ollie.bus.deploy.DeploymentFiles;
import net.ollie.bus.deploy.target.PutProgress;

import java.util.concurrent.CompletableFuture;

class DeploymentChainProgress implements PutProgress {

    private final DeploymentChain chain;

    DeploymentChainProgress(final DeploymentChain chain) {
        this.chain = chain;
    }

    @Override
    public int progress() {
        throw new UnsupportedOperationException(); //TODO
    }

    @Override
    public CompletableFuture<? extends DeploymentFiles> future() {
        throw new UnsupportedOperationException(); //TODO
    }

}
