package net.ollie.sandwich.deploy.source.provider;

import net.ollie.sandwich.deploy.source.DeploymentSource;
import net.ollie.sandwich.utils.provider.KeyValueProvider;

public interface DeploymentSourceProvider<D extends DeploymentSource>
        extends KeyValueProvider<String, D> {

}
