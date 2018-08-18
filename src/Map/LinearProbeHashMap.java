package Map;

/**
 * @author : codedsun
 * Created on 18/08/18
 */

import java.util.ArrayList;
import PriorityQueue.Entry;

/**
 * Implementation of Open Addressing
 * In this we have use a instance DEFUNCT to denote a location at which entry is deleted, so as to
 * distinguish between a it and null.
 */
public class LinearProbeHashMap<K, V> extends AbstractHashMap<K, V> {

    private MapEntry<K, V> table[]; // the table of the map entry
    private MapEntry<K, V> DEFUNCT = new MapEntry<>(null, null);

    public LinearProbeHashMap() {
        super();
    }

    public LinearProbeHashMap(int capacity) {
        super(capacity);
    }

    public LinearProbeHashMap(int capacity, int prime) {
        super(capacity, prime);
    }

    @Override
    protected void createTable() {
        table = new MapEntry[capacity];
    }

    //Utility Methods
    private boolean isAvailable(int j) {
        return table[j] == null || table[j] == DEFUNCT;
    }

    //return index with key k or -(a+1) for the values can be added at next slot
    private int findSlot(int h, K k) {
        int avail = -1;
        int j = h;
        do{
            if(isAvailable(j)){
                if(avail == -1 ) avail = j; // first available slot, if search fails we will add to it
                if(table[j] == null) break;
            }
            else{
                if(table[j].getKey().equals(k)) {
                    return j;
                }
            }
            j= j+1 % capacity;
        }while(j!= h);
        return -(avail+1);
    }

    @Override
    protected V bucketGet(int h, K k) {
        int j = findSlot(h, k);
        if(j < 0) return null;
        return table[j].getValue();
    }

    @Override
    protected V bucketPut(int h, K k, V v) {
        int j = findSlot(h, k);
        if(j >=  0 ) { //this key had an existing entry
            return table[j].setValue(v);
        } else{
            table[-(j+1)] = new MapEntry<>(k,v);
            n++;
        }
        return null;
    }

    @Override
    protected V bucketRemove(int h, K k) {
        int j = findSlot(h, k);
        if(j < 0) return null;
        V answer = table[j].getValue();
        table[j] = DEFUNCT;
        n--;
        return answer;
    }

    @Override
    public Iterable<Entry<K, V>> entrySet() {
        ArrayList<Entry<K, V>> buffer = new ArrayList<>();
        for(int h = 0; h < capacity; h++ ) {
            if(!isAvailable(h)){
                buffer.add(table[h]);
            }
        }
        return buffer;
    }

    public static void main(String[] args) {

    }
}
