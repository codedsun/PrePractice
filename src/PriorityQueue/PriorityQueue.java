package PriorityQueue;

/**
 * @author : codedsun
 * Created on 13/06/18
 */

public interface PriorityQueue<K, V> {
    int size();

    boolean isEmpty();

    Entry<K, V> insert(K key, V value ) throws IllegalArgumentException;

    Entry<K,V> min();

    Entry<K,V> removeMin();
}
