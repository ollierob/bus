package net.olie.bus.deploy.project;

import net.ollie.bus.deploy.DeployProto;
import net.ollie.bus.deploy.source.DeploymentSourceHandler;

import javax.annotation.Nonnull;

public sealed interface DeploymentProjectOrFolder
        permits DeploymentProject, DeploymentProjectFolder {

    @Nonnull
    String id();

    int version();

    DeployProto.DeployProjectOrFolder toProto(
            DeploymentSourceHandler<DeployProto.DeploySource> sourceHandler);

}
