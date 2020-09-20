package net.olie.bus.deploy.project;

import net.ollie.bus.deploy.DeployProto;
import net.ollie.bus.deploy.source.DeploymentSourceHandler;
import net.ollie.protobuf.BuildsProto;

import java.util.Set;

public record DeploymentProjectFolder(String id, String name, Set<DeploymentProjectOrFolder> children)
        implements DeploymentProjectOrFolder, BuildsProto<DeployProto.DeployProjectOrFolder> {

    @Override
    public DeployProto.DeployProjectOrFolder toProto() {
        return DeployProto.DeployProjectOrFolder.newBuilder()
                .setId(id)
                .setName(name)
                .build();
    }

    @Override
    public DeployProto.DeployProjectOrFolder toProto(final DeploymentSourceHandler<DeployProto.DeploySource> sourceHandler) {
        return this.toProto();
    }

}
