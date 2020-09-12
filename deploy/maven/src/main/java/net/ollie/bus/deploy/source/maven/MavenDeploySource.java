package net.ollie.bus.deploy.source.maven;

import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.repository.maven.MavenRepository;
import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.GetProgress;
import net.ollie.protobuf.BuildsProto;

public record MavenDeploySource(String id, MavenRepository repository, MavenArtifact artifact)
        implements DeploymentSource, BuildsProto<MavenProtos.MavenDeploySource> {

    @Override
    public GetProgress get() {
        return this.repository().get(this.artifact());
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
