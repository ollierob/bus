package net.ollie.sandwich.deploy.repository.maven.nexus3;

import com.google.common.base.Preconditions;
import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.repository.maven.RemoteMavenRepository;
import net.ollie.sandwich.deploy.source.download.DownloadFileProgress;
import net.ollie.sandwich.deploy.source.maven.MavenArtifact;

public record Nexus3Repository(MavenProtos.MavenRepository spec, Nexus3RepositoryResource resource) implements RemoteMavenRepository {

    public Nexus3Repository {
        Preconditions.checkArgument(spec.hasNexus3());
    }

    @Override
    public DownloadFileProgress get(final MavenArtifact artifact) {
        return resource.get(
                artifact.groupId('/'),
                artifact.artifactId(),
                artifact.version(),
                artifact.filename());
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
