package net.ollie.bus.deploy.source.maven;

import net.ollie.bus.deploy.repository.maven.MavenRepository;
import net.ollie.bus.deploy.source.GetProgress;

public record MavenRepositorySource(String id, MavenRepository repository, MavenArtifact artifact) implements MavenSource {

    @Override
    public GetProgress get() {
        return this.repository().get(this.artifact());
    }

}
