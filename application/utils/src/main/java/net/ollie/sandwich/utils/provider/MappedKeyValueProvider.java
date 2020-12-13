package net.ollie.sandwich.utils.provider;

import com.google.common.collect.Maps;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class MappedKeyValueProvider<K, V>
        implements FiniteKeyValueProvider<K, V> {

    final Map<K, V> map = Maps.newConcurrentMap();

    @Override
    public V get(final K key) {
        return map.get(key);
    }

    @Nonnull
    @Override
    public Set<K> getAllKeys() {
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override
    public Map<K, V> getAll() {
        return Collections.unmodifiableMap(map);
    }

    protected V put(final K key, final V value) {
        return map.put(key, value);
    }

    @CheckForNull
    protected V putIfAbsent(final K key, final V value) {
        return map.putIfAbsent(key, value);
    }

    protected V computeIfAbsent(final K key, final Function<? super K, ? extends V> createValue) {
        return map.computeIfAbsent(key, createValue);
    }

}
