package net.ollie.bus.deploy.repository.maven;

import net.ollie.bus.Resource;
import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.repository.maven.provider.MavenRepositoryBuilder;
import net.ollie.bus.deploy.repository.maven.provider.MavenRepositoryProvider;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Singleton
public class MavenRepositoryResource implements Resource {

    private final MavenRepositoryBuilder builder;
    private final MavenRepositoryProvider repositories;

    @Inject
    MavenRepositoryResource(
            final MavenRepositoryBuilder builder,
            final MavenRepositoryProvider repositories) {
        this.builder = builder;
        this.repositories = repositories;
    }

    @GET
    @Path("get/{id}")
    @Produces(APPLICATION_PROTOBUF)
    public MavenProtos.MavenRepository get(@PathParam("id") final String id) {
        final var repo = repositories.get(id);
        if (repo == null) throw new NotFoundException(id);
        return repo.toProto();
    }

    @POST
    @Path("edit")
    @Consumes(APPLICATION_PROTOBUF)
    public Response edit(final MavenProtos.MavenRepository spec) {
        final var repo = builder.build(spec);
        return Response.ok().build();
    }

}
