package net.ollie.sandwich.utils.provider;

import com.google.common.collect.Collections2;
import com.google.common.collect.Maps;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface FiniteKeyValueProvider<K, V> extends KeyValueProvider<K, V> {

    @Nonnull
    Set<K> getAllKeys();

    @Nonnull
    default Collection<V> getAllValues() {
        return Collections2.transform(this.getAllKeys(), this::get);
    }

    @Nonnull
    default Map<K, V> getAll() {
        return Maps.toMap(this.getAllKeys(), this::get);
    }

}
