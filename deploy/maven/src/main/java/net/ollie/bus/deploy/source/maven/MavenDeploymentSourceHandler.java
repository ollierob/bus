package net.ollie.bus.deploy.source.maven;

import net.ollie.bus.deploy.source.DeploymentSourceHandler;

public interface MavenDeploymentSourceHandler<R>
        extends DeploymentSourceHandler<R> {

    R handle(MavenDeploymentSource source);

}
