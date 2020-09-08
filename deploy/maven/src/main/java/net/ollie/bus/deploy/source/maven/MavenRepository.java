package net.ollie.bus.deploy.source.maven;

import net.ollie.bus.deploy.respository.Repository;
import net.ollie.bus.deploy.source.GetProgress;

import javax.annotation.Nonnull;

public interface MavenRepository extends Repository {

    @Nonnull
    GetProgress get(MavenArtifact artifact);

}
