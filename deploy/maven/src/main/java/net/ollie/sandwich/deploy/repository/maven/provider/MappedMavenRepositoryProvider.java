package net.ollie.sandwich.deploy.repository.maven.provider;

import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.repository.maven.MavenRepository;
import net.ollie.sandwich.deploy.respository.provider.MappedRepositoryProvider;

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
        //Create from spec, else lookup
        return repositoryBuilder.build(spec)
                .orElseGet(() -> this.require(spec.getId()));
    }

}
