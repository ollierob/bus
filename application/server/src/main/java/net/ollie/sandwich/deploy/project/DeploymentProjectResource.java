package net.ollie.sandwich.deploy.project;

import net.ollie.sandwich.deploy.project.provider.DeploymentProjectProvider;
import net.ollie.sandwich.resource.AbstractResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static net.ollie.sandwich.resource.Resource.APPLICATION_PROTOBUF;

@Singleton
@Produces({MediaType.TEXT_PLAIN, APPLICATION_PROTOBUF})
public class DeploymentProjectResource extends AbstractResource {

    private final DeploymentProjectProvider projects;

    @Inject
    DeploymentProjectResource(final DeploymentProjectProvider projects) {
        this.projects = projects;
    }

    @GET
    @Path("id")
    public DeploymentProjectOrFolder get() {
        return projects.root();
    }

    @GET
    @Path("id/{id}")
    public DeploymentProjectOrFolder get(@PathParam("id") final String id) {
        return projects.requireOrThrow(id, NotFoundException::new);
    }

    @PUT
    @Path("folder/{parent}/{id}")
    public DeploymentProjectFolder createFolder(
            @PathParam("parent") final String parentId,
            @PathParam("id") final String id,
            final String name)
            throws DeploymentProjectProvider.ProjectOperationException {
        return projects.createFolder(parentId, id, name);
    }

}
