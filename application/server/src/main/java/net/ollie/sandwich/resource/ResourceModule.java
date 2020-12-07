package net.ollie.sandwich.resource;

import com.google.inject.AbstractModule;
import net.ollie.sandwich.resource.jaxrs.JaxRsModule;

public class ResourceModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.bind(JavascriptResource.class);
        this.bind(CssResource.class);
        this.install(new JaxRsModule());
    }

}
