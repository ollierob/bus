package net.ollie.sandwich.utils.provider;

import javax.annotation.Nonnull;

public interface MutableVersionedValueProvider<K, V> extends MutableValueProvider<K, V> {

    int version(@Nonnull V value);

    @Override
    default V put(final V value) {
        return this.put(value, this.version(value) - 1);
    }

    default boolean didPut(final V value) {
        return this.put(value) == value;
    }

    @Nonnull
    V put(V value, int expectedVersion);

}
