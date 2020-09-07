package net.ollie.bus.deploy.source;

import javax.annotation.Nonnull;

/**
 * @see net.ollie.bus.deploy.target.DeploymentTarget
 */
public interface DeploymentSource {

    @Nonnull
    GetProgress get();

}
