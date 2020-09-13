package net.ollie.bus.deploy.source.maven.provider;

import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.source.maven.MavenDeploymentSource;
import net.ollie.bus.deploy.source.provider.DeploymentSourceProvider;

import javax.annotation.Nonnull;

public interface MavenDeploymentSourceProvider
        extends DeploymentSourceProvider<MavenDeploymentSource> {

    @Nonnull
    MavenDeploymentSource fromProto(@Nonnull MavenProtos.MavenDeploySource spec);

}
