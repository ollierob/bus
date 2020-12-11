package net.ollie.sandwich.deploy.repository.proto;

import net.ollie.sandwich.deploy.RepositoryProto;
import net.ollie.sandwich.deploy.repository.AllRepositoryHandler;
import net.ollie.sandwich.deploy.repository.maven.MavenRepository;
import net.ollie.sandwich.deploy.respository.Repository;

import javax.inject.Singleton;
import java.util.Collection;

@Singleton
public class RepositoryToProtoHandler
        implements AllRepositoryHandler<RepositoryProto.Repository> {

    public RepositoryProto.Repository toProto(final Repository repository) {
        return repository.handleWith(this);
    }

    public RepositoryProto.RepositoryList toProtos(final Collection<? extends Repository> repositories) {
        final var builder = RepositoryProto.RepositoryList.newBuilder();
        for (final var repository : repositories) {
            builder.addRepository(this.toProto(repository));
        }
        return builder.build();
    }

    @Override
    public RepositoryProto.Repository handle(final MavenRepository repository) {
        return RepositoryProto.Repository.newBuilder()
                .setMaven(repository.toProto())
                .build();
    }

}
