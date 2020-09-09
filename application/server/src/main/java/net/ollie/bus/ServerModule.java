package net.ollie.bus;

import com.google.inject.AbstractModule;
import net.ollie.bus.deploy.DeployModule;

class ServerModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new DeployModule());
    }

}
