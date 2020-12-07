package net.ollie.sandwich.utils.provider;

public interface MutableKeyValueProvider<K, V> extends KeyValueProvider<K, V> {

    V put(K key, V value);

}
