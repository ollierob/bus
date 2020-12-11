package net.ollie.sandwich.deploy.respository.provider;

import net.ollie.sandwich.deploy.respository.Repository;
import net.ollie.sandwich.utils.provider.FiniteKeyValueProvider;

import javax.annotation.Nonnull;

public interface RepositoryProvider<R extends Repository>
        extends FiniteKeyValueProvider<String, R> {

    @Nonnull
    R put(R repository, int expectedVersion);

    @Nonnull
    R delete(String id);

}
