package ListADT;

/**
 * @author : codedsun
 * Created on 01/May/2018
 */


/**
 * The class is ArrayBased Implementation of List ADT
 * @param <E> - Generic
 */
public class ArrayList<E> implements List<E> {
    private static int CAPACITY = 16;
    E data[];
    private  int size = 0;

    public ArrayList(int CAPACITY){
        ArrayList.CAPACITY = CAPACITY;
        data = (E[]) new Object[CAPACITY];

    }
    public ArrayList(){
        this(CAPACITY);
    }
    @Override
    public boolean isEmpty() {
        return size ==0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public E set(int i, E o) throws IndexOutOfBoundsException {
        E element = null;
        if(checkIndex(i)){
            element = data[i];
            data[i] = o;
            return element;
        }
        else throw new IndexOutOfBoundsException("Out of Size");

    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if(checkIndex(index)){
            return data[index];
        }
        else
            throw new IndexOutOfBoundsException("Out of Size");
    }

    @Override
    public void add(int i, E o) {
        if(checkIndex(i)){
            if(size == CAPACITY){
                throw new IndexOutOfBoundsException("Can't add overflow");
            }
            else
            {
                for(int j = size-1 ;j>=i;j--){
                    data[j] = data[j-1];
                }
                data[i] = o;
            }
            size++;
        }
        else
            throw new IndexOutOfBoundsException("Out of Size");

    }

    @Override
    public E remove(int i) {
        E element;
        if(checkIndex(i)){
            element = data[i];
            for(int j = i; j<size;j++){
                data[j] = data[j+1];
            }
            size--;
            return element;
        }
        else
        {
            throw new IndexOutOfBoundsException("Out of Bounds");
        }
    }

    private boolean checkIndex(int i){
        return i >= 0 && i <= size;
    }
}

/** Class to implement the arraylist created
 *remember that this is not same as ArrayList in java, as it has a fixed size while that's dynamic in nature
 */

class Test{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(10);
        arrayList.add(0,"Suneet");
        arrayList.add(1,"Vineet");
        arrayList.add(2,"Navneet");
        arrayList.add(3,"Sueeta");
        System.out.println("Size= " +arrayList.getSize());
        System.out.println("IsEmpty : "+arrayList.isEmpty());
        System.out.println("Removing element 1 " +arrayList.remove(0));

    }
}