package net.ollie.bus.deploy.source.maven.provider;

import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.repository.maven.provider.MavenRepositoryProvider;
import net.ollie.bus.deploy.source.maven.MavenArtifact;
import net.ollie.bus.deploy.source.maven.MavenDeploymentSource;
import net.ollie.bus.deploy.source.provider.MappedDeploymentSourceProvider;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MappedMavenDeploymentSourceProvider
        extends MappedDeploymentSourceProvider<MavenDeploymentSource>
        implements MavenDeploymentSourceProvider {

    private final MavenRepositoryProvider repositoryProvider;

    @Inject
    MappedMavenDeploymentSourceProvider(final MavenRepositoryProvider repositoryProvider) {
        this.repositoryProvider = repositoryProvider;
    }

    @Override
    public MavenDeploymentSource fromProto(final MavenProtos.MavenDeploySource spec) {
        return new MavenDeploymentSource(
                spec.getId(),
                repositoryProvider.fromProto(spec.getRepository()),
                MavenArtifact.fromProto(spec.getArtifact()));
    }

}
