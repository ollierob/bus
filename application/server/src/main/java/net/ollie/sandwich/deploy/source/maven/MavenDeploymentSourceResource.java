package net.ollie.sandwich.deploy.source.maven;

import net.ollie.sandwich.deploy.source.maven.provider.MavenDeploymentSourceProvider;
import net.ollie.sandwich.resource.AbstractResource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

public class MavenDeploymentSourceResource extends AbstractResource {

    private final MavenDeploymentSourceProvider provider;

    @Inject
    MavenDeploymentSourceResource(final MavenDeploymentSourceProvider provider) {
        this.provider = provider;
    }

    @GET
    @Path("get/{id}")
    @Produces(APPLICATION_PROTOBUF)
    public MavenDeploymentSource get(@PathParam("id") final String id) {
        return provider.requireOrThrow(id, NotFoundException::new);
    }

}
