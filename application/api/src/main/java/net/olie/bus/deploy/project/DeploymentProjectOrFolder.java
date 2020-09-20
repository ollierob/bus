package net.olie.bus.deploy.project;

import javax.annotation.Nonnull;

public sealed interface DeploymentProjectOrFolder
        permits DeploymentProject, DeploymentProjectFolder {

    @Nonnull
    String id();

}
