package Map;

/**
 * @author : codedsun
 * Created on 13/08/18
 */

import PriorityQueue.Entry;

import java.util.ArrayList;
import java.util.Random;

/**
 * Implementation of Hash Table or Hash map
 * The following class provide implementation of enlargement of tables when load factor becomes > 0.5
 * and it also provide the implementation of hashing function which uses the @fun(hashCode()) method
 */
public abstract class AbstractHashMap<K, V> extends AbstractMap<K, V> {
    protected int n = 0;
    protected int capacity;
    private int prime;
    private long scale, shift; //the shift and scaling factors used in hashmap

    public AbstractHashMap(int cap, int p) {
        prime = p;
        capacity = cap;
        Random random = new Random();
        scale = random.nextInt((prime - 1)) + 1;
        shift = random.nextInt(prime);
        createTable();

    }

    public AbstractHashMap(int cap) {
        this(cap, 109345121); // default prime
    }

    public AbstractHashMap(){
        this(17); //default capacity
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public V put(K key, V value) {
        V answer = bucketPut(hashValue(key), key, value);
        if(n > capacity / 2) {
            resize(2 * capacity -1 );
        }
        return answer;
    }

    @Override
    public V get(K key) {
        return bucketGet(hashValue(key), key);
    }

    @Override
    public V remove(K key) {
        return bucketRemove(hashValue(key), key);
    }

    private int hashValue(K key) {
        return (int) ((Math.abs(key.hashCode()*scale + shift)% prime)%capacity);
    }

    private void resize(int newCap) {

        ArrayList<Entry<K,V>> buffer = new ArrayList<>(n);
        for(Entry<K,V> e : entrySet()) {
            buffer.add(e);
        }

        capacity = newCap;
        createTable();
        n = 0;
        for(Entry<K,V> e : buffer){
            put(e.getKey(), e.getValue());
        }

    }

    //Methods to be implemented by Each subclass for implementation

    protected abstract void createTable(); // this should create an initially empty table or size equal to designated capacity
    protected abstract V bucketGet(int h, K k);// this is similar to get method, which return value of hash(key) = h of Key k
    protected abstract V bucketPut(int h, K k, V v); //this is similar to put method, which is known for hash(key) = h of key k  and value v
    protected abstract V bucketRemove(int h, K k); //this is similar to remove method, for key whose hash(key) = h
}
