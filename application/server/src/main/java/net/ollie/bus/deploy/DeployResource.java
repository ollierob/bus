package net.ollie.bus.deploy;

import net.ollie.bus.deploy.repository.RepositoryResource;
import net.ollie.bus.deploy.source.DeploymentSourceResource;
import net.ollie.bus.resource.AbstractResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Path;

@Singleton
@Path("deploy")
public class DeployResource extends AbstractResource {

    private final DeploymentSourceResource sources;
    private final RepositoryResource repositories;

    @Inject
    DeployResource(
            final DeploymentSourceResource sources,
            final RepositoryResource repositories) {
        this.sources = sources;
        this.repositories = repositories;
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
