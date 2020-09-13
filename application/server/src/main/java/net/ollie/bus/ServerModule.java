package net.ollie.bus;

import com.google.inject.AbstractModule;
import net.ollie.bus.deploy.DeployModule;
import net.ollie.bus.manage.ManageModule;
import net.ollie.bus.process.ProcessModule;

class ServerModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new ProcessModule());
        this.install(new DeployModule());
        this.install(new ManageModule());
    }

}
