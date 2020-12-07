package net.ollie.sandwich.deploy.repository.maven;

import net.ollie.sandwich.deploy.maven.MavenProtos;
import net.ollie.sandwich.deploy.respository.Repository;
import net.ollie.sandwich.deploy.source.GetProgress;
import net.ollie.sandwich.deploy.source.maven.MavenArtifact;
import net.ollie.protobuf.BuildsProto;

import javax.annotation.Nonnull;

public interface MavenRepository extends Repository, BuildsProto<MavenProtos.MavenRepository> {

    @Nonnull
    GetProgress get(MavenArtifact artifact);

}
