package net.ollie.bus.deploy.source.maven;

import net.ollie.bus.deploy.repository.maven.MavenRepository;
import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.GetProgress;

public record MavenSource(MavenRepository repository, MavenArtifact artifact) implements DeploymentSource {

    @Override
    public GetProgress get() {
        return this.repository().get(this.artifact());
    }

}
