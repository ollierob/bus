package net.ollie.sandwich.deploy.source.maven.provider;

import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.repository.maven.provider.MavenRepositoryProvider;
import net.ollie.sandwich.deploy.source.maven.MavenArtifact;
import net.ollie.sandwich.deploy.source.maven.MavenDeploymentSource;
import net.ollie.sandwich.deploy.source.provider.MappedDeploymentSourceProvider;

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
        if (!spec.hasRepository() || !spec.hasArtifact()) return this.require(spec.getId());
        return new MavenDeploymentSource(
                spec.getId(),
                repositoryProvider.fromProto(spec.getRepository()),
                MavenArtifact.fromProto(spec.getArtifact()));
    }

}
