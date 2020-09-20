package net.ollie.bus.deploy.project;

import net.olie.bus.deploy.project.DeploymentProjectFolder;
import net.olie.bus.deploy.project.DeploymentProjectOrFolder;
import net.olie.bus.deploy.project.provider.DeploymentProjectProvider;
import net.ollie.bus.utils.provider.MappedVersionedValueProvider;

public class MappedDeploymentProjectProvider
        extends MappedVersionedValueProvider<String, DeploymentProjectOrFolder>
        implements DeploymentProjectProvider {

    @Override
    public DeploymentProjectOrFolder root() {
        return this.computeIfAbsent("root", id -> new DeploymentProjectFolder(id, "Root", 1));
    }

}
