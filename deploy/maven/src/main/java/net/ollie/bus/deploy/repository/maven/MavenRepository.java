package net.ollie.bus.deploy.repository.maven;

import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.respository.Repository;
import net.ollie.bus.deploy.source.GetProgress;
import net.ollie.bus.deploy.source.maven.MavenArtifact;
import net.ollie.bus.protobuf.BuildsProto;

import javax.annotation.Nonnull;
import javax.annotation.OverridingMethodsMustInvokeSuper;

public interface MavenRepository extends Repository, BuildsProto<MavenProtos.MavenRepository> {

    @Nonnull
    GetProgress get(MavenArtifact artifact);

    @Nonnull
    @OverridingMethodsMustInvokeSuper
    default MavenProtos.MavenRepository.Builder toProtoBuilder() {
        return MavenProtos.MavenRepository.newBuilder()
                .setId(this.id());
    }

    @Override
    default MavenProtos.MavenRepository toProto() {
        return this.toProtoBuilder().build();
    }

}
