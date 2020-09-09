package net.ollie.bus.deploy.repository;

import com.google.inject.AbstractModule;
import net.ollie.bus.deploy.repository.maven.MavenModule;

public class RepositoryModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new MavenModule());
    }

}
