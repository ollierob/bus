package net.ollie.bus.deploy.repository.maven;

import net.ollie.bus.deploy.maven.MavenProtos;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Singleton
public class MavenRepositoryResource {

    private final MavenRepositoryBuilder builder;

    @Inject
    MavenRepositoryResource(final MavenRepositoryBuilder builder) {
        this.builder = builder;
    }

    @PUT
    @Path("create")
    public Response create(MavenProtos.MavenRepository spec) {
        final var repo = builder.build(spec);
        return Response.ok().build();
    }

}
