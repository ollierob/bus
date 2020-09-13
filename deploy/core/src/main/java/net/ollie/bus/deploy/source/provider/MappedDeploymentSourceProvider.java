package net.ollie.bus.deploy.source.provider;

import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.utils.provider.MappedKeyValueProvider;

public class MappedDeploymentSourceProvider<D extends DeploymentSource>
        extends MappedKeyValueProvider<String, D>
        implements DeploymentSourceProvider<D> {

}
