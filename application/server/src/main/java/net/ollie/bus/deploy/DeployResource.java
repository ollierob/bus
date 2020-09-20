package net.ollie.bus.deploy;

import net.ollie.bus.deploy.project.DeploymentProjectResource;
import net.ollie.bus.deploy.repository.RepositoryResource;
import net.ollie.bus.deploy.source.DeploymentSourceResource;
import net.ollie.bus.resource.AbstractBundleResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Singleton
@Path("deploy")
public class DeployResource extends AbstractBundleResource {

    private final DeploymentProjectResource projects;
    private final DeploymentSourceResource sources;
    private final RepositoryResource repositories;

    @Inject
    DeployResource(
            final DeploymentProjectResource projects,
            final DeploymentSourceResource sources,
            final RepositoryResource repositories) {
        this.projects = projects;
        this.sources = sources;
        this.repositories = repositories;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response router() {
        return this.readRouterResource("deploy");
    }

    @Path("project")
    public DeploymentProjectResource projects() {
        return projects;
    }

    @Path("source")
    public DeploymentSourceResource sources() {
        return sources;
    }

    @Path("repository")
    public RepositoryResource respositories() {
        return repositories;
    }

}
