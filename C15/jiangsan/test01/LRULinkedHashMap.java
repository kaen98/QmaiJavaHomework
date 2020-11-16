package main.test01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LRULinkedHashMap<K, V> {

    private final LinkedHashMap<K, V> cacheMap;

    public LRULinkedHashMap(int size) {
        cacheMap = new LinkedHashMap<K, V>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size + 1 == cacheMap.size();
            }
        };
    }

    public void putCache(K key, V value) {
        cacheMap.put(key, value);
    }

    public V getCache(K key) {
        return cacheMap.get(key);
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        Set<Map.Entry<K, V>> entrySet = cacheMap.entrySet();

        for (Map.Entry<K, V> entry : entrySet) {

            st.append(entry.getKey())
                    .append(":")
                    .append(entry.getValue())
                    .append("<-");

        }

        return st.toString();
    }
}
