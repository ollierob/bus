package net.olie.bus.deploy.project.provider;

import net.olie.bus.deploy.project.DeploymentProjectOrFolder;
import net.ollie.bus.utils.provider.KeyValueProvider;

public interface DeploymentProjectProvider extends KeyValueProvider<String, DeploymentProjectOrFolder> {

    default DeploymentProjectOrFolder root() {
        return this.get(null);
    }

}
