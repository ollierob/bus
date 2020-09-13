package net.ollie.bus.deploy.source.provider;

import com.google.common.collect.Maps;
import net.ollie.bus.deploy.source.DeploymentSource;

import java.util.Map;

public class MappedDeploymentSourceProvider<D extends DeploymentSource>
        implements DeploymentSourceProvider<D> {

    private final Map<String, D> map = Maps.newConcurrentMap();

    @Override
    public D get(final String id) {
        return map.get(id);
    }

}
