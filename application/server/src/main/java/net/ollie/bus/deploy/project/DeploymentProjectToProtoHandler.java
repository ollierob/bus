package net.ollie.bus.deploy.project;

import net.olie.bus.deploy.project.DeploymentProject;
import net.olie.bus.deploy.project.DeploymentProjectFolder;
import net.olie.bus.deploy.project.DeploymentProjectOrFolder;
import net.ollie.bus.deploy.DeployProto;
import net.ollie.bus.deploy.source.proto.DeploymentSourceToProtoHandler;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DeploymentProjectToProtoHandler {

    private final DeploymentSourceToProtoHandler sourceToProto;

    @Inject
    DeploymentProjectToProtoHandler(final DeploymentSourceToProtoHandler sourceToProto) {
        this.sourceToProto = sourceToProto;
    }

    public DeployProto.DeployProjectOrFolder toProto(final DeploymentProjectOrFolder item) {
        return item.toProto(sourceToProto);
    }

}
