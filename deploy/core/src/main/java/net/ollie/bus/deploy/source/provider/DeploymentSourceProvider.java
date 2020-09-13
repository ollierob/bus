package net.ollie.bus.deploy.source.provider;

import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.utils.provider.KeyValueProvider;

public interface DeploymentSourceProvider<D extends DeploymentSource>
        extends KeyValueProvider<String, D> {

}
