package net.olie.bus.deploy.project;

import java.util.Set;

public record DeploymentProjectFolder(String id, Set<DeploymentProjectOrFolder> children)
        implements DeploymentProjectOrFolder {

}
