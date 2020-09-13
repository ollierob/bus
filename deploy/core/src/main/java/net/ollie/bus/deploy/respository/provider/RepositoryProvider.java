package net.ollie.bus.deploy.respository.provider;

import net.ollie.bus.deploy.respository.Repository;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import java.util.Map;

public interface RepositoryProvider<R extends Repository> {

    @CheckForNull
    R get(String id);

    @Nonnull
    default R require(final String id) {
        final var got = this.get(id);
        if (got == null) throw new IllegalArgumentException(id);
        return got;
    }

    @Nonnull
    Map<String, R> getAll();

    @Nonnull
    R put(R repository, int expectedVersion);

}
