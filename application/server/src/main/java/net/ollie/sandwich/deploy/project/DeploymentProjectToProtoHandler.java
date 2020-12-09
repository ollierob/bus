package net.ollie.sandwich.deploy.project;

import net.ollie.sandwich.deploy.DeployProto;
import net.ollie.sandwich.deploy.source.proto.DeploymentSourceToProtoHandler;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class DeploymentProjectToProtoHandler {

    private final DeploymentSourceToProtoHandler sourceToProto;

    @Inject
    DeploymentProjectToProtoHandler(final DeploymentSourceToProtoHandler sourceToProto) {
        this.sourceToProto = sourceToProto;
    }

    DeployProto.DeployProjectOrFolder toProto(final DeploymentProjectOrFolder item) {
        return item.toProto(sourceToProto);
    }

}
