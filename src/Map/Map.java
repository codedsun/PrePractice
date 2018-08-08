package Map;

/**
 * @author : codedsun
 * Created on 08/08/18
 */

import PriorityQueue.Entry;

/**
 * An interface to implement Maps which are generally key,value pairs
 * @param <K>
 * @param <V>
 */
public interface Map<K,V> {
    int size();
    boolean isEmpty();
    V put(K key, V value);
    V get(K key);
    V remove(K key);
    Iterable<K> keySet();
    Iterable<V> values();
    Iterable<Entry<K,V>> entrySet();
}
