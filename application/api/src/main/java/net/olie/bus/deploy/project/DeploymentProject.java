package net.olie.bus.deploy.project;

import com.google.common.base.MoreObjects;
import net.ollie.bus.deploy.DeployProto;
import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.DeploymentSourceHandler;
import net.ollie.bus.deploy.target.DeploymentTarget;

public record DeploymentProject(String id, String name, DeploymentSource source, DeploymentTarget target)
        implements DeploymentProjectOrFolder {

    @Override
    public DeployProto.DeployProjectOrFolder toProto(final DeploymentSourceHandler<DeployProto.DeploySource> sourceHandler) {
        return DeployProto.DeployProjectOrFolder.newBuilder()
                .setId(id)
                .setName(MoreObjects.firstNonNull(name, ""))
                .setSource(sourceHandler.handle(source))
                .build();
    }

}
