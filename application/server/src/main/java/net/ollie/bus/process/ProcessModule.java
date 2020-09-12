package net.ollie.bus.process;

import com.google.inject.AbstractModule;

public class ProcessModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.bind(JavascriptResource.class);
    }

}
