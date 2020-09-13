package net.ollie.bus.deploy.source.maven;

import net.ollie.bus.deploy.source.maven.provider.MavenDeploymentSourceProvider;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public class MavenDeploymentSourceResource {

    private final MavenDeploymentSourceProvider provider;

    @Inject
    MavenDeploymentSourceResource(final MavenDeploymentSourceProvider provider) {
        this.provider = provider;
    }

    @GET
    @Path("get/{id}")
    public MavenDeploymentSource get(@PathParam("id") final String id) {
        return provider.requireOrThrow(id, NotFoundException::new);
    }

}
