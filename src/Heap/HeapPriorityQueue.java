package Heap;

import PriorityQueue.AbstractPriorityQueue;
import PriorityQueue.Entry;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author : codedsun
 * Created on 19/06/18
 */

/**
 * Using ArrayList for implementation of heap
 *
 * @param <K>
 * @param <V>
 */
public class HeapPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {

    private ArrayList<Entry<K, V>> heap = new ArrayList<>();

    public HeapPriorityQueue() {
        super();
    }

    public HeapPriorityQueue(Comparator<K> comparator) {
        super(comparator);
    }

    protected int parent(int j) {
        return (j - 1) / 2;
    }

    protected int left(int j) {
        return ((2 * j) + 1);
    }

    protected int right(int j) {
        return (2 * j) + 2;
    }

    protected boolean hasLeft(int j) {
        return left(j) < heap.size();
    }

    protected boolean hasRight(int j) {
        return right(j) < heap.size();
    }

    protected void swap(int i, int j) {
        Entry<K, V> entry = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, entry);
    }



    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        return;
    }

    @Override
    public Entry<K, V> min() {
        return null;
    }

    @Override
    public Entry<K, V> removeMin() {
        return null;
    }
}
