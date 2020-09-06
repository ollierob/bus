package net.ollie.bus.deploy.source.maven;

import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.GetProgress;

import javax.annotation.Nonnull;

public interface MavenSource extends DeploymentSource {

    @Nonnull
    MavenArtifact artifact();

    @Nonnull
    MavenRepository repository();

    @Override
    default GetProgress get() {
        return this.repository().get(this.artifact());
    }

}
