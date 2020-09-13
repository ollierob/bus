package net.ollie.bus.deploy.respository.provider;

import net.ollie.bus.deploy.respository.Repository;
import net.ollie.bus.utils.provider.MappedKeyValueProvider;

import java.util.Map;

public class MappedRepositoryProvider<R extends Repository>
        extends MappedKeyValueProvider<String, R>
        implements RepositoryProvider<R> {

    @Override
    public Map<String, R> getAll() {
        return super.getAll();
    }

    @Override
    public R put(final R repository, final int expectedVersion) {
        if (expectedVersion == 0) {
            return this.putIfAbsent(repository.id(), repository);
        } else {
            throw new UnsupportedOperationException();
        }
    }

}
