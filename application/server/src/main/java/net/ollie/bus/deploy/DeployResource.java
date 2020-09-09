package net.ollie.bus.deploy;

import net.ollie.bus.deploy.repository.RepositoryResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Path;

@Singleton
public class DeployResource {

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
