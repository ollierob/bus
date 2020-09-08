package net.ollie.bus.deploy.repository.maven.central;

import net.ollie.bus.deploy.repository.maven.RemoteMavenRepository;
import net.ollie.bus.deploy.source.download.DownloadFileProgress;
import net.ollie.bus.deploy.source.maven.MavenArtifact;

/**
 * e.g. https://search.maven.org/remotecontent?filepath=com/google/guava/guava-gwt/29.0-jre/guava-gwt-29.0-jre.jar
 */
public record MavenCentralRepository(String id, MavenCentralSearchEndpoint mavenCentral) implements RemoteMavenRepository {

    @Override
    public DownloadFileProgress get(final MavenArtifact artifact) {
        return mavenCentral.get(path(artifact));
    }

    private static String path(final MavenArtifact artifact) {
        return artifact.groupId('/')
                + '/' + artifact.artifactId()
                + '/' + artifact.version()
                + '/' + artifact.filename();
    }

}
