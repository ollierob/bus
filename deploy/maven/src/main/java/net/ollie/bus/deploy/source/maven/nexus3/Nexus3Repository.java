package net.ollie.bus.deploy.source.maven.nexus3;

import net.ollie.bus.deploy.source.GetProgress;
import net.ollie.bus.deploy.source.maven.MavenArtifact;
import net.ollie.bus.deploy.source.maven.RemoteMavenRepository;

public record Nexus3Repository(String id, Nexus3RepositoryEndpoint nexus) implements RemoteMavenRepository {

    @Override
    public GetProgress get(final MavenArtifact artifact) {
        return nexus.get(
                slashDelimit(artifact.groupId()),
                artifact.artifactId(),
                artifact.version(),
                artifact.filename());
    }

    private static String slashDelimit(final String groupId) {
        return groupId.replace('.', '/');
    }

}
