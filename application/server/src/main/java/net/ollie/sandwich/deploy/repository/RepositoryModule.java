package net.ollie.sandwich.deploy.repository;

import com.google.inject.AbstractModule;
import net.ollie.sandwich.deploy.repository.maven.MavenRepositoryModule;

public class RepositoryModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new MavenRepositoryModule());
    }

}
