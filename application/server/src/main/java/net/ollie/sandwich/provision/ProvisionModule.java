package net.ollie.sandwich.provision;

import com.google.inject.AbstractModule;

public class ProvisionModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.bind(ProvisionResource.class);
    }

}
