package net.ollie.sandwich.deploy.source.maven;

import net.ollie.sandwich.deploy.source.DeploymentSourceHandler;

public interface MavenDeploymentSourceHandler<R>
        extends DeploymentSourceHandler<R> {

    R handle(MavenDeploymentSource source);

}
