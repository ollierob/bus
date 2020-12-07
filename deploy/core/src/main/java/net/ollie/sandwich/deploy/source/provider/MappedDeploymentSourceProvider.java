package net.ollie.sandwich.deploy.source.provider;

import net.ollie.sandwich.deploy.source.DeploymentSource;
import net.ollie.sandwich.utils.provider.MappedKeyValueProvider;

public class MappedDeploymentSourceProvider<D extends DeploymentSource>
        extends MappedKeyValueProvider<String, D>
        implements DeploymentSourceProvider<D> {

}
