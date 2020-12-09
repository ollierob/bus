package net.ollie.sandwich.deploy.source;

import net.ollie.sandwich.deploy.source.maven.MavenDeploymentSourceResource;
import net.ollie.sandwich.resource.AbstractResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Collection;

@Singleton
@Path("source")
public class DeploymentSourceResource extends AbstractResource {

    private final MavenDeploymentSourceResource maven;

    @Inject
    DeploymentSourceResource(final MavenDeploymentSourceResource maven) {
        this.maven = maven;
    }

    @GET
    @Path("get")
    public Collection<? extends DeploymentSource> getAll() {
        return maven.getAll();
    }

    @Path("maven")
    public MavenDeploymentSourceResource maven() {
        return maven;
    }

}
