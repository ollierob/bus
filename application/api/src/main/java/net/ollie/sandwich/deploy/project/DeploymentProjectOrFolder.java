package net.ollie.sandwich.deploy.project;

import net.ollie.sandwich.deploy.DeployProto;
import net.ollie.sandwich.deploy.source.DeploymentSourceHandler;

import javax.annotation.Nonnull;

public sealed interface DeploymentProjectOrFolder
        permits DeploymentProject, DeploymentProjectFolder {

    @Nonnull
    String id();

    int version();

    DeployProto.DeployProjectOrFolder toProto(
            DeploymentSourceHandler<DeployProto.DeploySource> sourceHandler);

}
