package net.ollie.bus.deploy.source.maven;

import com.google.inject.AbstractModule;
import net.ollie.bus.deploy.source.maven.provider.MappedMavenDeploymentSourceProvider;
import net.ollie.bus.deploy.source.maven.provider.MavenDeploymentSourceProvider;

public class MavenDeploymentModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.bind(MavenDeploymentSourceProvider.class).to(MappedMavenDeploymentSourceProvider.class);
    }

}
