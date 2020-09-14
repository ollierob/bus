package net.ollie.bus.resource;

import com.google.inject.AbstractModule;
import net.ollie.bus.resource.jaxrs.JaxRsModule;

public class ResourceModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.bind(JavascriptResource.class);
        this.bind(CssResource.class);
        this.install(new JaxRsModule());
    }

}
