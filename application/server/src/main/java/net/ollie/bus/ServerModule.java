package net.ollie.bus;

import com.google.inject.AbstractModule;
import net.ollie.bus.deploy.DeploymentResourceModule;
import net.ollie.bus.manage.ManageModule;
import net.ollie.bus.resource.ResourceModule;

class ServerModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new ResourceModule());
        this.install(new DeploymentResourceModule());
        this.install(new ManageModule());
    }

}
