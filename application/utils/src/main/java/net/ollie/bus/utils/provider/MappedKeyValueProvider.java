package net.ollie.bus.utils.provider;

import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.Map;

public class MappedKeyValueProvider<K, V>
        implements KeyValueProvider<K, V> {

    private final Map<K, V> map = Maps.newConcurrentMap();

    @Override
    public V get(final K key) {
        return map.get(key);
    }

    protected Map<K, V> getAll() {
        return Collections.unmodifiableMap(map);
    }

    protected V put(final K key, final V value) {
        return map.put(key, value);
    }

    protected V putIfAbsent(final K key, final V value) {
        return map.putIfAbsent(key, value);
    }

}
