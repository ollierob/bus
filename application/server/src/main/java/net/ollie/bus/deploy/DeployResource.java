package net.ollie.bus.deploy;

import net.ollie.bus.deploy.repository.RepositoryResource;
import net.ollie.bus.process.AbstractResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Path;

@Singleton
@Path("deploy")
public class DeployResource extends AbstractResource {

    private final RepositoryResource repositories;

    @Inject
    DeployResource(final RepositoryResource repositories) {
        this.repositories = repositories;
    }

    @Path("repository")
    public RepositoryResource respositories() {
        return repositories;
    }

}
