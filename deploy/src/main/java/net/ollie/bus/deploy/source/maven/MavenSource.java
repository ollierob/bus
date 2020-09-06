package net.ollie.bus.deploy.source.maven;

import net.ollie.bus.deploy.source.DeploymentSource;

import javax.annotation.Nonnull;

public interface MavenSource extends DeploymentSource {

    @Nonnull
    MavenArtifact artifact();

}
