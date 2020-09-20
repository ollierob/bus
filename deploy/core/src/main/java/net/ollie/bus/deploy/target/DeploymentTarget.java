package net.ollie.bus.deploy.target;

import net.ollie.bus.deploy.DeploymentFiles;

import javax.annotation.Nonnull;

/**
 * @see net.ollie.bus.deploy.source.DeploymentSource
 */
public interface DeploymentTarget {

    @Nonnull
    PutProgress put(DeploymentFiles files);

    <R> R handleWith(DeploymentTargetHandler<R> handler);

}
