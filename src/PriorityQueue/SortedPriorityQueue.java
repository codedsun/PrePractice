package PriorityQueue;

import ListADT.LinkedPositionalList;
import ListADT.Position;
import ListADT.PositionalList;

/**
 * @author : codedsun
 * Created on 14/06/18
 */

/**
 * Implementation with sorted priority queue, here always the insertion take O(n) time as the insertion is
 * done keeping the order sorted, while the remove() and min() method takes only O(1) time.
 *
 * @param <K>
 * @param <V>
 */
public class SortedPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {

    private PositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

    public SortedPriorityQueue() {
        super();
    }

    @Override

    public int size() {
        return list.size();
    }

    @Override
    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K, V> newest = new PQEntry<>(key, value);
        Position<Entry<K, V>> walk = list.last();
        while (walk != null && compare(newest, walk.getElement()) < 0) {
            walk = list.before(walk);
        }
        if (walk == null ){
            list.addFirst(newest);
        }
        else
            list.addAfter(walk, newest);
        return newest;
    }

    @Override
    public Entry<K, V> min() {
        return list.first().getElement();
    }

    @Override
    public Entry<K, V> removeMin() {
        return list.remove(list.first());
    }
}
