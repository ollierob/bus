package net.ollie.sandwich;

import com.google.inject.AbstractModule;
import net.ollie.sandwich.deploy.DeploymentModule;
import net.ollie.sandwich.manage.ManageModule;
import net.ollie.sandwich.provision.ProvisionModule;
import net.ollie.sandwich.resource.ResourceModule;

class ServerModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new ResourceModule());
        this.install(new ProvisionModule());
        this.install(new DeploymentModule());
        this.install(new ManageModule());
    }

}
