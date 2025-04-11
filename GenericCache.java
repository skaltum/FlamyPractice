package FlamyMap;

import java.util.HashMap;
import java.util.Map;

public class GenericCache<K, V> {
    private final Map<K, V> cache;

    public GenericCache() {
        this.cache = new HashMap<>();
    }

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public V get(K key) {
        return cache.get(key);
    }

    public boolean containsKey(K key) {
        return cache.containsKey(key);
    }

    public V remove(K key) {
        return cache.remove(key);
    }

    public void clear() {
        cache.clear();
    }

    public int size() {
        return cache.size();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        cache.putAll(map);
    }
}
