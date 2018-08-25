package Map;

/**
 * @author : codedsun
 * Created on 18/08/18
 */

import java.util.ArrayList;
import java.util.function.Consumer;

import PriorityQueue.Entry;

/**
 * An implementation of Seperate chaining (Chain HashMap) for collison resolution
 * In this the entire hashtable is represented as array of secondary hashmap
 * <p>
 * In this we have assumed a array of map (HashTable) whose index are set to null at initial and
 * the get operation is perfomed as HashTable[h].get(key)
 * the push operation is performed as HashTable[h].put(key, value)
 */
public class ChainHashMap<K, V> extends AbstractHashMap<K, V> {
    private UnsortedTreeMap<K, V>[] table; //Hash table

    private ChainHashMap() {
        super();
    }

    private ChainHashMap(int capacity) {
        super(capacity);
    }

    private ChainHashMap(int capacity, int prime) {
        super(capacity, prime);
    }


    @Override
    protected void createTable() {
        table = new UnsortedTreeMap[capacity];
    }

    @Override
    protected V bucketGet(int h, K k) {
        UnsortedTreeMap<K, V> bucket = table[h];
        if (bucket == null) {
            return null;
        } else {
            return bucket.get(k);
        }
    }

    //For extra corner cases, we have updated the size on changes in the internal map size only
    @Override
    protected V bucketPut(int h, K k, V v) {
        UnsortedTreeMap<K, V> bucket = table[h];
        if (bucket == null) {
            bucket = new UnsortedTreeMap();
            table[h] = bucket;
        }
        int oldSize = bucket.size();
        V answer = bucket.put(k, v);
        n = n + bucket.size() - oldSize;
        return answer;
    }

    @Override
    protected V bucketRemove(int h, K k) {
        UnsortedTreeMap<K, V> bucket = table[h];
        if (bucket == null) {
            return null;
        }
        int oldSize = bucket.size();
        V answer = bucket.remove(k);
        n = n - (oldSize - bucket.size());
        return answer;
    }


    @Override
    public Iterable<Entry<K, V>> entrySet() {
        ArrayList<Entry<K, V>> buffer = new ArrayList<>();
        for (int h = 0; h < capacity; h++) {
            if (table[h] != null) {
                for (Entry<K, V> entry : table[h].entrySet()) {
                    System.out.println(entry.getKey() + " "+entry.getValue());
                    buffer.add(entry);
                }
            }
        }
        return buffer;
    }

    public static void main(String[] args) {
        ChainHashMap chainHashMap = new ChainHashMap();
        chainHashMap.put("s", "1");
        chainHashMap.put("u", "2");
        chainHashMap.put("n", "3");
        chainHashMap.put("e", "4");
        chainHashMap.put("e", "5");
        chainHashMap.put("t", "6");
        chainHashMap.remove("sakshi");
        chainHashMap.remove("t");
        chainHashMap.entrySet();

    }
}
