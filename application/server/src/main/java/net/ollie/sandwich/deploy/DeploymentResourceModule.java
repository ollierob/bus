package net.ollie.sandwich.deploy;

import com.google.inject.AbstractModule;
import net.ollie.sandwich.deploy.project.DeploymentProjectModule;
import net.ollie.sandwich.deploy.repository.RepositoryModule;
import net.ollie.sandwich.deploy.source.DeploymentSourceModule;

public class DeploymentResourceModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new DeploymentProjectModule());
        this.install(new DeploymentSourceModule());
        this.install(new RepositoryModule());
        this.bind(DeploymentResource.class);
    }

}
