package net.ollie.bus.deploy.repository.maven.provider;

import net.ollie.bus.deploy.repository.maven.MavenRepository;
import net.ollie.bus.deploy.respository.MappedRepositoryProvider;

import javax.inject.Singleton;

@Singleton
public class MappedMavenRepositoryProvider extends MappedRepositoryProvider<MavenRepository> implements MavenRepositoryProvider {

}
