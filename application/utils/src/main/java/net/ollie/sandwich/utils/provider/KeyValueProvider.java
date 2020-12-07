package net.ollie.sandwich.utils.provider;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import java.util.function.Function;

public interface KeyValueProvider<K, V> {

    @CheckForNull
    V get(K key);

    @Nonnull
    default V require(final K key) throws IllegalArgumentException {
        return this.requireOrThrow(key, k -> new IllegalArgumentException("Not found: " + k));
    }

    @Nonnull
    default <X extends Exception> V requireOrThrow(final K key, final Function<K, X> ifMissing) throws X {
        final var got = this.get(key);
        if (got == null) throw ifMissing.apply(key);
        return got;
    }

}
