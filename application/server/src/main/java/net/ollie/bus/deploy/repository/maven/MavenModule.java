package net.ollie.bus.deploy.repository.maven;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.internal.ResteasyClientBuilderImpl;

import javax.inject.Singleton;

public class MavenModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
    }

    @Provides
    @Singleton
    MavenRepositoryBuilder repositoryBuilder() {
        final var builder = new ResteasyClientBuilderImpl().build();
        return new MavenRepositoryBuilder(() -> builder);
    }

}
