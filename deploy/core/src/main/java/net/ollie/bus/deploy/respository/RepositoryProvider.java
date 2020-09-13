package net.ollie.bus.deploy.respository;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import java.util.Map;

public interface RepositoryProvider<R extends Repository> {

    @CheckForNull
    R get(String id);

    @Nonnull
    Map<String, R> getAll();

    @Nonnull
    R put(R repository, int expectedVersion);

}
