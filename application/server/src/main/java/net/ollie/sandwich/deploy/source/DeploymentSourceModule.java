package net.ollie.sandwich.deploy.source;

import com.google.inject.AbstractModule;
import net.ollie.sandwich.deploy.source.maven.MavenDeploymentModule;

public class DeploymentSourceModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new MavenDeploymentModule());
    }

}
