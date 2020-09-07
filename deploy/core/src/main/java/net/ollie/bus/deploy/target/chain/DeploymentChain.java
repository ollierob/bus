package net.ollie.bus.deploy.target.chain;

import net.ollie.bus.deploy.DeploymentFiles;
import net.ollie.bus.deploy.target.DeploymentTarget;
import net.ollie.bus.deploy.target.PutProgress;

public class DeploymentChain implements DeploymentTarget {

    private final DeploymentTarget first, second;

    public DeploymentChain(
            final DeploymentTarget first,
            final DeploymentTarget second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public PutProgress put(final DeploymentFiles files) {
        return new DeploymentChainProgress(this);
    }

}
