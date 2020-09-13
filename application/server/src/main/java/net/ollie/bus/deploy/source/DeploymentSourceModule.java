package net.ollie.bus.deploy.source;

import com.google.inject.AbstractModule;
import net.ollie.bus.deploy.source.maven.MavenDeploymentModule;

public class DeploymentSourceModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new MavenDeploymentModule());
    }

}
