package net.ollie.sandwich.deploy.repository.maven;

import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.repository.maven.provider.MavenRepositoryProvider;
import net.ollie.sandwich.resource.AbstractResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Singleton
@Path("maven")
public class MavenRepositoryResource extends AbstractResource {

    private final MavenRepositoryProvider repositories;

    @Inject
    MavenRepositoryResource(
            final MavenRepositoryProvider repositories) {
        this.repositories = repositories;
    }

    @GET
    @Path("get/{id}")
    @Produces(APPLICATION_PROTOBUF)
    public MavenRepository get(@PathParam("id") final String id) {
        return repositories.requireOrThrow(id, NotFoundException::new);
    }

    @POST
    @Path("edit")
    @Consumes(APPLICATION_PROTOBUF)
    public Response edit(
            @QueryParam("expectedVersion") final int expectedVersion,
            final MavenProtos.MavenRepository spec) {
        final var repo = repositories.fromProto(spec);
        final var put = repositories.put(repo, expectedVersion);
        return put == repo
                ? ok()
                : conflict("Expected " + expectedVersion + " but was " + repo.version());
    }

}
