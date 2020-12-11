package net.ollie.sandwich.deploy.repository;

import net.ollie.sandwich.deploy.repository.maven.MavenRepositoryResource;
import net.ollie.sandwich.deploy.respository.Repository;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Collection;

@Singleton
@Path("repository")
public class RepositoryResource {

    private final MavenRepositoryResource maven;

    @Inject
    RepositoryResource(final MavenRepositoryResource maven) {
        this.maven = maven;
    }

    @GET
    @Path("get")
    public Collection<? extends Repository> repositories() {
        return maven.getAll();
    }

    @Path("maven")
    public MavenRepositoryResource maven() {
        return maven;
    }

}
