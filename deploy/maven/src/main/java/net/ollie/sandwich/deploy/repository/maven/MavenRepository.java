package net.ollie.sandwich.deploy.repository.maven;

import net.ollie.protobuf.BuildsProto;
import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.respository.Repository;
import net.ollie.sandwich.deploy.respository.RepositoryHandler;
import net.ollie.sandwich.deploy.source.GetProgress;
import net.ollie.sandwich.deploy.source.maven.MavenArtifact;

import javax.annotation.Nonnull;

public interface MavenRepository extends Repository, BuildsProto<MavenProtos.MavenRepository> {

    @Nonnull
    GetProgress get(MavenArtifact artifact);

    @Override
    default <R> R handleWith(final RepositoryHandler<R> handler) {
        return handler instanceof MavenRepositoryHandler
                ? this.handleWith((MavenRepositoryHandler<R>) handler)
                : null;
    }

    default <R> R handleWith(final MavenRepositoryHandler<R> handler) {
        return handler.handle(this);
    }

}
