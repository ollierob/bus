package net.ollie.bus.deploy.respository;

import com.google.common.collect.Maps;

import java.util.Map;

public class MappedRepositoryProvider<R extends Repository> implements RepositoryProvider<R> {

    private final Map<String, R> map = Maps.newConcurrentMap();

    @Override
    public R get(final String id) {
        return map.get(id);
    }

}
