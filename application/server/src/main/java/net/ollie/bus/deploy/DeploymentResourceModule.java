package net.ollie.bus.deploy;

import com.google.inject.AbstractModule;
import net.ollie.bus.deploy.project.DeploymentProjectModule;
import net.ollie.bus.deploy.repository.RepositoryModule;
import net.ollie.bus.deploy.source.DeploymentSourceModule;

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
