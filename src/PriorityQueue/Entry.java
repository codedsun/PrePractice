package PriorityQueue;

/**
 * @author : codedsun
 * Created on 13/Jun/2018
 *
 */

/*
    Every insertion/deletion in priority queue is of type Entry<K,V>
    @param K : key of the object
    @param V : value of the object
 */
public interface Entry<K,V> {
    K getKey();
    V getValue();
}
