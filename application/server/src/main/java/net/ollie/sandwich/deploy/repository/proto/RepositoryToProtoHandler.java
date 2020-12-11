package net.ollie.sandwich.deploy.repository.proto;

import net.ollie.sandwich.deploy.RepositoryProto;
import net.ollie.sandwich.deploy.repository.AllRepositoryHandler;
import net.ollie.sandwich.deploy.repository.maven.MavenRepository;

import javax.inject.Singleton;

@Singleton
public class RepositoryToProtoHandler
        implements AllRepositoryHandler<RepositoryProto.Repository> {

    @Override
    public RepositoryProto.Repository handle(final MavenRepository repository) {
        return RepositoryProto.Repository.newBuilder()
                .setMaven(repository.toProto())
                .build();
    }

}
