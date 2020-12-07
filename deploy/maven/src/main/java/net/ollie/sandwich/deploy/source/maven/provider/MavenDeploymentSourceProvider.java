package net.ollie.sandwich.deploy.source.maven.provider;

import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.source.maven.MavenDeploymentSource;
import net.ollie.sandwich.deploy.source.provider.DeploymentSourceProvider;

import javax.annotation.Nonnull;

public interface MavenDeploymentSourceProvider
        extends DeploymentSourceProvider<MavenDeploymentSource> {

    @Nonnull
    MavenDeploymentSource fromProto(@Nonnull MavenProtos.MavenDeploySource spec);

}
