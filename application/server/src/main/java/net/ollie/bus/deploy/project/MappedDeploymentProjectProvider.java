package net.ollie.bus.deploy.project;

import net.olie.bus.deploy.project.DeploymentProjectOrFolder;
import net.olie.bus.deploy.project.provider.DeploymentProjectProvider;
import net.ollie.bus.utils.provider.MappedKeyValueProvider;

public class MappedDeploymentProjectProvider
        extends MappedKeyValueProvider<String, DeploymentProjectOrFolder>
        implements DeploymentProjectProvider {

}
