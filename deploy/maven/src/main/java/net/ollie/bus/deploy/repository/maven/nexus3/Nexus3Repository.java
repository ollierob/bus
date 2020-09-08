package net.ollie.bus.deploy.repository.maven.nexus3;

import net.ollie.bus.deploy.repository.maven.RemoteMavenRepository;
import net.ollie.bus.deploy.source.GetProgress;
import net.ollie.bus.deploy.source.maven.MavenArtifact;

public record Nexus3Repository(String id, Nexus3RepositoryEndpoint nexus) implements RemoteMavenRepository {

    @Override
    public GetProgress get(final MavenArtifact artifact) {
        return nexus.get(
                artifact.groupId('/'),
                artifact.artifactId(),
                artifact.version(),
                artifact.filename());
    }

}
