package net.ollie.bus.deploy.respository.provider;

import net.ollie.bus.deploy.respository.Repository;
import net.ollie.bus.utils.provider.KeyValueProvider;

import javax.annotation.Nonnull;
import java.util.Map;

public interface RepositoryProvider<R extends Repository>
        extends KeyValueProvider<String, R> {

    @Nonnull
    Map<String, R> getAll();

    @Nonnull
    R put(R repository, int expectedVersion);

}
