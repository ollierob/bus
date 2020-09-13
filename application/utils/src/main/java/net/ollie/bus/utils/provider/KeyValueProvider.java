package net.ollie.bus.utils.provider;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public interface KeyValueProvider<K, V> {

    @CheckForNull
    V get(K key);

    @Nonnull
    default V require(final K key) {
        final var got = this.get(key);
        if (got == null) throw new IllegalArgumentException("Not found: " + key);
        return got;
    }

}
