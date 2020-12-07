package net.ollie.sandwich;

import com.google.inject.AbstractModule;
import net.ollie.sandwich.deploy.DeploymentResourceModule;
import net.ollie.sandwich.manage.ManageModule;
import net.ollie.sandwich.resource.ResourceModule;

class ServerModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new ResourceModule());
        this.install(new DeploymentResourceModule());
        this.install(new ManageModule());
    }

}
