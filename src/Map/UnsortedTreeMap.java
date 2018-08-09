package Map;

/**
 * @author : codedsun
 * Created on 09/08/18
 */

import PriorityQueue.Entry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An implementation of Map using an
 *
 * @see(ArrayList.java). In this we doesn't remove the element by arraylist.remove(index) method due to
 * O(n) cost but we will move the last index value to the removed value index j and then remove the last element
 * because it's an unordered list.
 */
public class UnsortedTreeMap<K, V> extends AbstractMap<K, V> {
    private ArrayList<MapEntry<K, V>> entry = new ArrayList<>();

    @Override
    public int size() {
        return entry.size();
    }

    @Override
    public V put(K key, V value) {
        int j = findIndex(key);
        if (j == -1) {
            entry.add(new MapEntry<>(key, value));
            return null;
        }

       return entry.get(j).setValue(value);
    }

    @Override
    public V get(K key) {
        int j = findIndex(key);
        if( j==-1 ) {
            return null;
        }
        else
            return entry.get(j).getValue();
    }

    @Override
    public V remove(K key) {
        int j = findIndex(key);
        if( j == -1 ) {
            return null;

        }
        V value = entry.get(j).getValue();
        entry.add(j, entry.get(size()-1));
        entry.remove(size()-1);
        return value;
    }

    private class EntrySetIterable implements Iterable<Entry<K, V>> {

        @Override
        public Iterator<Entry<K, V>> iterator() {
            return new EntrySetIterator();
        }
    }

    private class EntrySetIterator implements Iterator<Entry<K, V>> {
        int j = 0;
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not Supported");
        }

        @Override
        public boolean hasNext() {
            return  (j <size()) ;
        }

        @Override
        public Entry<K, V> next() {
            if(j == size()) throw new NoSuchElementException();
            return entry.get(j++);
        }
    }
    @Override
    public Iterable<Entry<K, V>> entrySet() {
        return new EntrySetIterable();
    }

    private int findIndex(K key) {
        for (int i = 0; i < entry.size(); i++) {
            if (key == entry.get(i).getKey()) {
                return i;
            }

        }
        return -1;
    }

}
