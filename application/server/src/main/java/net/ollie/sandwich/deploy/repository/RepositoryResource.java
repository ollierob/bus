package net.ollie.sandwich.deploy.repository;

import net.ollie.sandwich.deploy.repository.maven.MavenRepositoryResource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Path;

@Singleton
@Path("repository")
public class RepositoryResource {

    private final MavenRepositoryResource maven;

    @Inject
    RepositoryResource(final MavenRepositoryResource maven) {
        this.maven = maven;
    }

    @Path("maven")
    public MavenRepositoryResource maven() {
        return maven;
    }

}
