package net.ollie.bus.deploy.source;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * @see net.ollie.bus.deploy.target.DeploymentTarget
 */
public interface DeploymentSource {

    @Nonnull
    String id();

    @Nonnull
    GetProgress get();

    @CheckForNull
    <R> R handleWith(@Nonnull DeploymentSourceHandler<R> handler);

}
