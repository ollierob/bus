package net.ollie.bus.deploy.repository.maven.provider;

import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.repository.maven.MavenRepository;
import net.ollie.bus.deploy.respository.provider.MappedRepositoryProvider;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MappedMavenRepositoryProvider
        extends MappedRepositoryProvider<MavenRepository>
        implements MavenRepositoryProvider {

    private final MavenRepositoryBuilder repositoryBuilder;

    @Inject
    MappedMavenRepositoryProvider(final MavenRepositoryBuilder repositoryBuilder) {
        this.repositoryBuilder = repositoryBuilder;
    }

    @Override
    public MavenRepository fromProto(final MavenProtos.MavenRepository spec) {
        return repositoryBuilder.build(spec);
    }

}
