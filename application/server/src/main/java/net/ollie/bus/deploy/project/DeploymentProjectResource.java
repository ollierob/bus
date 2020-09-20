package net.ollie.bus.deploy.project;

import net.olie.bus.deploy.project.DeploymentProjectOrFolder;
import net.olie.bus.deploy.project.provider.DeploymentProjectProvider;
import net.ollie.bus.resource.AbstractResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Singleton
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

}
