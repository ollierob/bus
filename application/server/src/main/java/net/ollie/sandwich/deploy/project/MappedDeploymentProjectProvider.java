package net.ollie.sandwich.deploy.project;

import net.ollie.sandwich.deploy.project.provider.DeploymentProjectProvider;
import net.ollie.sandwich.utils.provider.MappedVersionedValueProvider;

public class MappedDeploymentProjectProvider
        extends MappedVersionedValueProvider<String, DeploymentProjectOrFolder>
        implements DeploymentProjectProvider {

    @Override
    public DeploymentProjectOrFolder root() {
        return this.computeIfAbsent("root", id -> new DeploymentProjectFolder(id, "Root", 1));
    }

}
