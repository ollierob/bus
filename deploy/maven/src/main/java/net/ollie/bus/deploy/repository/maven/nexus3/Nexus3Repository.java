package net.ollie.bus.deploy.repository.maven.nexus3;

import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.repository.maven.RemoteMavenRepository;
import net.ollie.bus.deploy.source.download.DownloadFileProgress;
import net.ollie.bus.deploy.source.maven.MavenArtifact;

public record Nexus3Repository(String id, int version, MavenProtos.Nexus3Repository spec, Nexus3RepositoryResource resource) implements RemoteMavenRepository {

    @Override
    public DownloadFileProgress get(final MavenArtifact artifact) {
        return resource.get(
                artifact.groupId('/'),
                artifact.artifactId(),
                artifact.version(),
                artifact.filename());
    }

    @Override
    public MavenProtos.MavenRepository.Builder toProtoBuilder() {
        return RemoteMavenRepository.super.toProtoBuilder()
                .setNexus3(spec);
    }

}
