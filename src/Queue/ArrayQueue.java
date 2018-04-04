package Queue;
/*
 The queue based implementation is circular based here as we have used a pointer to
    @param f: that marks the front of the queue
    @param sz: denotes the no of items in queue
    @param capacity: total capacity of queue

    f = (f+sz)%
 */
public class ArrayQueue<E> implements Queue<E> {

    private int CAPACITY = 100;
    private E data[];
    private int sz ;
    private int f ;

    ArrayQueue(){
        this(100);
    }

    ArrayQueue(int capacity){
        data = (E[]) new Object[CAPACITY];
        sz = 0;
        f = -1;

    }
    @Override
    public void enqueue(E e) {
        if(sz == data.length){
            throw new IllegalStateException("Queue is full");
        }
        else{
            int f1 = (f+sz)%data.length;
            data[f1] = e;
            sz++;
        }


    }

    @Override
    public E dequeue() {
        E element = null;
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty");


        }
        else{
             element = data[f];
            data[f] = null; // For better garbage collection
            f = (f+1)%data.length;
            sz--;

        }
        return element;

    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public E front() {
        if(f==-1) return null;
        else
             return data[f];
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }
}
