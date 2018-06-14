package PriorityQueue;

import java.util.Comparator;

/**
 * @author : codedsun
 * Created on 14/06/18
 */

public abstract class AbstractPriorityQueue<K, V> implements PriorityQueue<K, V> {

    public static class PQEntry<K, V> implements Entry<K, V> {
        private K key;
        private V value;

        public PQEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        protected void setKey(K key) {
            this.key = key;
        }

        protected void setValue(V value) {
            this.value = value;
        }
    }

    private Comparator<K> comp;

    protected AbstractPriorityQueue(Comparator<K> c) {
        this.comp = c;
    }

    protected AbstractPriorityQueue() {
        this(new DefaultComparator<K>());
    }

    protected int compare(Entry<K, V> a, Entry<K, V> b) {
        return comp.compare(a.getKey(), b.getKey());
    }

    /* Detects whether the key is valid or not */
    protected boolean checkKey(K key) throws IllegalArgumentException {
        try {
            return (comp.compare(key, key) == 0);
        } catch (ClassCastException e) {
            throw new ClassCastException("Incompatible key");
        }
    }

    public boolean isEmpty(){
        return size() == 0;
    }


}
