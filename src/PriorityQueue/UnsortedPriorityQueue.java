package PriorityQueue;

import ListADT.LinkedPositionalList;
import ListADT.Position;
import ListADT.PositionalList;

/**
 * @author : codedsun
 * Created on 14/06/18
 */

/*
  Implementation of Priority Queue using Unsorted Linked List
 */
public class UnsortedPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {

    private PositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

    public UnsortedPriorityQueue() {
        super();
    }

    @Override
    public int size() {
        return list.size();
    }

    private Position<Entry<K, V>> findMin() {
        Position<Entry<K, V>> small = list.first();
        Position<Entry<K, V>> first = list.first();
        Position<Entry<K, V>> temp;
        try {
            for (int i = 0; i < list.size() - 1; i++) {
                temp = list.after(first);
                if (compare(first.getElement(), temp.getElement()) > 0) {
                    small = first;
                }
                first = temp;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return small;
    }

    @Override
    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K, V> newest = new PQEntry(key, value);
        list.addLast(newest);
        return newest;
    }

    @Override
    public Entry<K, V> min() {
        if (list.isEmpty()) return null;
        else
            return findMin().getElement();
    }

    @Override
    public Entry<K, V> removeMin() {
        if (list.isEmpty()) return null;
        else return list.remove(findMin());
    }
}
