package net.ollie.bus.deploy.source;

import net.ollie.bus.deploy.source.maven.MavenDeploymentSourceResource;
import net.ollie.bus.resource.AbstractResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Path;

@Singleton
@Path("source")
public class DeploymentSourceResource extends AbstractResource {

    private final MavenDeploymentSourceResource maven;

    @Inject
    DeploymentSourceResource(final MavenDeploymentSourceResource maven) {
        this.maven = maven;
    }

    @Path("maven")
    public MavenDeploymentSourceResource maven() {
        return maven;
    }

}
