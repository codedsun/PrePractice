package Map;

/**
 * @author : codedsun
 * Created on 08/08/18
 */

import PriorityQueue.Entry;

import java.util.Iterator;

/**
 * A base class that can be used for various purposes
 *
 * @param <K> - the key
 * @param <V> - the value
 */
public abstract class AbstractMap<K, V> implements Map<K, V> {

    private static class MapEntry<K, V> implements Entry<K, V> {
        K key;
        V value;

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V setValue(V value) {
            V old = value;
            this.value = value;
            return old;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }
    }

    @Override
    public  boolean isEmpty(){
        return size() == 0;
    }

    private class KeyIterable implements Iterable<K> {

        @Override
        public Iterator<K> iterator() {
            return new KeyIterator();
        }
    }

    private class KeyIterator implements Iterator<K> {
        private Iterator<Entry<K, V>> enteries = entrySet().iterator();
        @Override
        public boolean hasNext() {
            return enteries.hasNext();
        }

        @Override
        public K next() {
            return enteries.next().getKey();
        }
    }


    @Override
    public Iterable<K> keySet() {
        return  new KeyIterable();
    }


    private class ValueIterator implements Iterator<V> {
        private Iterator<Entry<K, V>> entries = entrySet().iterator();
        @Override
        public boolean hasNext() {
            return entries.hasNext();
        }

        @Override
        public V next() {
            return entries.next().getValue();
        }
    }

    private class ValueIterable implements Iterable<V> {

        @Override
        public Iterator<V> iterator() {
            return new ValueIterator();
        }
    }
    @Override
    public Iterable<V> values() {
        return new ValueIterable();
    }
}
