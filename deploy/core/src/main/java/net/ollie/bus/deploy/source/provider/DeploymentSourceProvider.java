package net.ollie.bus.deploy.source.provider;

import net.ollie.bus.deploy.source.DeploymentSource;

import javax.annotation.CheckForNull;

public interface DeploymentSourceProvider<D extends DeploymentSource> {

    @CheckForNull
    D get(String id);

}
