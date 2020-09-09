package net.ollie.bus.deploy.respository;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public interface RepositoryProvider<R extends Repository> {

    @CheckForNull
    R get(String id);

    @Nonnull
    R put(R repository, int expectedVersion);

}
