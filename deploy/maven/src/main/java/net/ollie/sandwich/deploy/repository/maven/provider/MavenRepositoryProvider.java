package net.ollie.sandwich.deploy.repository.maven.provider;

import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.repository.maven.MavenRepository;
import net.ollie.sandwich.deploy.respository.provider.RepositoryProvider;

import javax.annotation.Nonnull;

public interface MavenRepositoryProvider extends RepositoryProvider<MavenRepository> {

    @Nonnull
    MavenRepository fromProto(@Nonnull MavenProtos.MavenRepository spec);

}
