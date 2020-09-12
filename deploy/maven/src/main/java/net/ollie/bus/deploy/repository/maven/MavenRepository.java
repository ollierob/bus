package net.ollie.bus.deploy.repository.maven;

import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.respository.Repository;
import net.ollie.bus.deploy.source.GetProgress;
import net.ollie.bus.deploy.source.maven.MavenArtifact;
import net.ollie.protobuf.BuildsProto;

import javax.annotation.Nonnull;

public interface MavenRepository extends Repository, BuildsProto<MavenProtos.MavenRepository> {

    @Nonnull
    GetProgress get(MavenArtifact artifact);

}
