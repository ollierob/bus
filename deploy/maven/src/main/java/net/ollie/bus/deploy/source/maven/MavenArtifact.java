package net.ollie.bus.deploy.source.maven;

public record MavenArtifact(String groupId, String artifactId, String version, String classifier, String type) {

    public MavenArtifact(final String groupId, final String artifactId, final String version) {
        this(groupId, artifactId, version, null, "jar");
    }

    public boolean isSnapshot() {
        return version.endsWith("SNAPSHOT");
    }

    public String groupId(final char separator) {
        return groupId.replace('.', separator);
    }

    public String filename() {
        return artifactId
                + '-' + version
                + (classifier == null ? "" : '-' + classifier)
                + '.' + type;
    }

}
