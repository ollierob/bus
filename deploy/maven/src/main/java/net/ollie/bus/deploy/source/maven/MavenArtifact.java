package net.ollie.bus.deploy.source.maven;

import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.protobuf.BuildsProto;

import java.util.Objects;

public record MavenArtifact(String groupId, String artifactId, String version, String classifier, String type)
        implements BuildsProto<MavenProtos.MavenArtifact> {

    public MavenArtifact(final String groupId, final String artifactId, final String version) {
        this(groupId, artifactId, version, null, "jar");
    }

    public MavenArtifact {
        Objects.requireNonNull(groupId, "groupId");
        Objects.requireNonNull(artifactId, "artifactId");
        Objects.requireNonNull(version, "version");
        Objects.requireNonNull(type, "type");
    }

    public boolean isSnapshot() {
        return version.endsWith("SNAPSHOT");
    }

    public boolean isRelease() {
        return !this.isSnapshot();
    }

    public boolean isLatest() {
        return version.equalsIgnoreCase("LATEST");
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

    @Override
    public MavenProtos.MavenArtifact toProto() {
        final var builder = MavenProtos.MavenArtifact.newBuilder()
                .setGroupId(groupId)
                .setArtifactId(artifactId)
                .setVersion(version)
                .setType(type);
        if (classifier != null) builder.setClassifier(classifier);
        return builder.build();
    }

    public static MavenArtifact fromProto(final MavenProtos.MavenArtifact proto) {
        return new MavenArtifact(
                proto.getGroupId(),
                proto.getArtifactId(),
                proto.getVersion(),
                proto.getClassifier(),
                proto.getType());
    }

}
