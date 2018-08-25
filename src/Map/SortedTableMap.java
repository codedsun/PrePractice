package Map;

/**
 * @author : codedsun
 * Created on 18/08/18
 */

import PriorityQueue.Entry;

/**
 * An extension over hash maps where we know the exact location of key
 * @param <K>
 * @param <V>
 */
public class SortedTableMap<K, V>  extends AbstractHashMap<K, V> {

    @Override
    protected void createTable() {

    }

    @Override
    protected V bucketGet(int h, K k) {
        return null;
    }

    @Override
    protected V bucketPut(int h, K k, V v) {
        return null;
    }

    @Override
    protected V bucketRemove(int h, K k) {
        return null;
    }

    @Override
    public Iterable<Entry<K, V>> entrySet() {
        return null;
    }
}
