package net.ollie.bus.utils.provider;

import javax.annotation.Nonnull;

public interface MutableVersionedValueProvider<K, V> extends MutableValueProvider<K, V> {

    int version(@Nonnull V value);

    @Override
    @Deprecated
    default V put(final V value) {
        return this.put(value, 0);
    }

    @Nonnull
    V put(V value, int expectedVersion);

}
