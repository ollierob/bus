package net.ollie.sandwich.deploy.repository.maven.central;

import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.repository.maven.RemoteMavenRepository;
import net.ollie.sandwich.deploy.source.download.DownloadFileProgress;
import net.ollie.sandwich.deploy.source.maven.MavenArtifact;

import javax.inject.Singleton;

/**
 * e.g. https://search.maven.org/remotecontent?filepath=com/google/guava/guava-gwt/29.0-jre/guava-gwt-29.0-jre.jar
 */
@Singleton
public record MavenCentralRepository(MavenProtos.MavenRepository spec, MavenCentralSearchResource mavenCentral) implements RemoteMavenRepository {

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

    @Override
    public String id() {
        return spec.getId();
    }

    @Override
    public int version() {
        return spec.getVersion();
    }

    @Override
    public MavenProtos.MavenRepository toProto() {
        return spec;
    }

}
