package net.ollie.sandwich.deploy.repository.maven;

import net.ollie.sandwich.deploy.respository.RepositoryHandler;

public interface MavenRepositoryHandler<R> extends RepositoryHandler<R> {

    R handle(MavenRepository repository);

}
