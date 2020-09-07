package net.ollie.bus.deploy.target;

import net.ollie.bus.deploy.DeploymentFiles;
import net.ollie.bus.deploy.target.chain.DeploymentChain;

import javax.annotation.Nonnull;

/**
 * @see net.ollie.bus.deploy.source.DeploymentSource
 */
public interface DeploymentTarget {

    @Nonnull
    PutProgress put(DeploymentFiles files);

    @Nonnull
    default DeploymentTarget then(final DeploymentTarget that) {
        return new DeploymentChain(this, that);
    }

}
