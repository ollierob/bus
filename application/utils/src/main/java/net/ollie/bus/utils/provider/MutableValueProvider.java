package net.ollie.bus.utils.provider;

import javax.annotation.Nonnull;

public interface MutableValueProvider<K, V> extends KeyValueProvider<K, V> {

    @Nonnull
    K keyFor(@Nonnull V value);

    @Nonnull
    V put(@Nonnull V value);

}
