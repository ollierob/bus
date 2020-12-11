package net.ollie.sandwich.deploy.repository.maven;

import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.repository.maven.provider.MavenRepositoryProvider;
import net.ollie.sandwich.resource.AbstractResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.Collection;

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
    @Path("get")
    public Collection<MavenRepository> getAll() {
        return repositories.getAllValues();
    }

    @GET
    @Path("get/{id}")
    @Produces(APPLICATION_PROTOBUF)
    public MavenRepository get(@PathParam("id") final String id) {
        return repositories.requireOrThrow(id, NotFoundException::new);
    }

    @POST
    @Path("modify")
    @Consumes(APPLICATION_PROTOBUF)
    public MavenRepository edit(
            final MavenProtos.MavenRepository spec,
            @QueryParam("expectedVersion") @DefaultValue("0") final int expectedVersion) {
        final var repo = repositories.fromProto(spec);
        final var put = repositories.put(repo, expectedVersion);
        return put == repo
                ? repo
                : throwConflict("Expected " + expectedVersion + " but was " + put.version());
    }

    @DELETE
    @Path("delete/{id}")
    public MavenRepository delete(final String id) {
        return repositories.delete(id);
    }

}
