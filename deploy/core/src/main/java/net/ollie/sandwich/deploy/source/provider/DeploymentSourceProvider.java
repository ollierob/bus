package net.ollie.sandwich.deploy.source.provider;

import net.ollie.sandwich.deploy.source.DeploymentSource;
import net.ollie.sandwich.utils.provider.FiniteKeyValueProvider;

public interface DeploymentSourceProvider<D extends DeploymentSource>
        extends FiniteKeyValueProvider<String, D> {

}
