package net.ollie.bus.deploy.respository.provider;

import com.google.common.collect.Maps;
import net.ollie.bus.deploy.respository.Repository;

import java.util.Collections;
import java.util.Map;

public class MappedRepositoryProvider<R extends Repository> implements RepositoryProvider<R> {

    private final Map<String, R> map = Maps.newConcurrentMap();

    @Override
    public R get(final String id) {
        return map.get(id);
    }

    @Override
    public Map<String, R> getAll() {
        return Collections.unmodifiableMap(map);
    }

    @Override
    public R put(final R repository, final int expectedVersion) {
        if (expectedVersion == 0) {
            return map.computeIfAbsent(repository.id(), k -> repository);
        } else {
            throw new UnsupportedOperationException();
        }
    }

}
