package net.ollie.sandwich.deploy.source.maven;

import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.repository.maven.MavenRepository;
import net.ollie.sandwich.deploy.source.DeploymentSource;
import net.ollie.sandwich.deploy.source.DeploymentSourceHandler;
import net.ollie.sandwich.deploy.source.GetProgress;
import net.ollie.protobuf.BuildsProto;

public record MavenDeploymentSource(String id, MavenRepository repository, MavenArtifact artifact)
        implements DeploymentSource, BuildsProto<MavenProtos.MavenDeploySource> {

    @Override
    public GetProgress get() {
        return this.repository().get(this.artifact());
    }

    @Override
    public <R> R handleWith(final DeploymentSourceHandler<R> handler) {
        return (handler instanceof MavenDeploymentSourceHandler<R> mavenHandler)
                ? this.handleWith(mavenHandler)
                : null;
    }

    public <R> R handleWith(final MavenDeploymentSourceHandler<R> handler) {
        return handler.handle(this);
    }

    @Override
    public MavenProtos.MavenDeploySource toProto() {
        return MavenProtos.MavenDeploySource.newBuilder()
                .setId(id)
                .setArtifact(artifact.toProto())
                .setRepository(repository.toProto())
                .build();
    }

}
