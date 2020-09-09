package net.ollie.bus.deploy;

import net.ollie.bus.Resource;
import net.ollie.bus.deploy.repository.RepositoryResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Path;

@Singleton
@Path("deploy")
public class DeployResource implements Resource {

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
