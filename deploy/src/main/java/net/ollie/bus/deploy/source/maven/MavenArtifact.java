package net.ollie.bus.deploy.source.maven;

public class MavenArtifact {

    private final String groupId, artifactId, version, classifier, type;

    public MavenArtifact(String groupId, String artifactId, String version) {
        this(groupId, artifactId, version, null, null);
    }

    public MavenArtifact(String groupId, String artifactId, String version, String classifier, String type) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.classifier = classifier;
        this.type = type;
    }

}
