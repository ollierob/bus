package net.ollie.sandwich.deploy.project;

import com.google.common.base.MoreObjects;
import net.ollie.sandwich.deploy.DeployProto;
import net.ollie.sandwich.deploy.source.DeploymentSource;
import net.ollie.sandwich.deploy.source.DeploymentSourceHandler;
import net.ollie.sandwich.deploy.target.DeploymentTarget;

public record DeploymentProject(String id, String name, int version, DeploymentSource source, DeploymentTarget target)
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
