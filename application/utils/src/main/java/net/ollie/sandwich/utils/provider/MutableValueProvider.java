package net.ollie.sandwich.utils.provider;

import javax.annotation.Nonnull;

public interface MutableValueProvider<K, V> extends KeyValueProvider<K, V> {

    @Nonnull
    K key(@Nonnull V value);

    @Nonnull
    V put(@Nonnull V value);

}
