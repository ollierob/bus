package net.ollie.sandwich.deploy.respository.provider;

import net.ollie.sandwich.deploy.respository.Repository;
import net.ollie.sandwich.utils.provider.MappedVersionedValueProvider;

import java.util.Map;

public class MappedRepositoryProvider<R extends Repository>
        extends MappedVersionedValueProvider<String, R>
        implements RepositoryProvider<R> {

    @Override
    public Map<String, R> getAll() {
        return super.getAll();
    }

    @Override
    public String key(final R value) {
        return value.id();
    }

    @Override
    public int version(final R value) {
        return value.version();
    }

}
