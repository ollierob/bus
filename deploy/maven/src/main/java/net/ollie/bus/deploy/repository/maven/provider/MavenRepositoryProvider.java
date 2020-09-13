package net.ollie.bus.deploy.repository.maven.provider;

import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.repository.maven.MavenRepository;
import net.ollie.bus.deploy.respository.RepositoryProvider;

import javax.annotation.Nonnull;

public interface MavenRepositoryProvider extends RepositoryProvider<MavenRepository> {

    @Nonnull
    MavenRepository fromProto(@Nonnull MavenProtos.MavenRepository spec);

}
