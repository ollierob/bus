package net.ollie.sandwich.deploy.repository.maven;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import net.ollie.sandwich.deploy.repository.maven.provider.MappedMavenRepositoryProvider;
import net.ollie.sandwich.deploy.repository.maven.provider.MavenRepositoryBuilder;
import net.ollie.sandwich.deploy.repository.maven.provider.MavenRepositoryProvider;
import org.jboss.resteasy.client.jaxrs.internal.ResteasyClientBuilderImpl;

import javax.inject.Singleton;

public class MavenRepositoryModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.bind(MavenRepositoryProvider.class).to(MappedMavenRepositoryProvider.class);
    }

    @Provides
    @Singleton
    MavenRepositoryBuilder repositoryBuilder() {
        final var builder = new ResteasyClientBuilderImpl().build();
        return new MavenRepositoryBuilder(() -> builder);
    }

}
