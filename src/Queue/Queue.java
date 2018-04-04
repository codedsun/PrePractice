package Queue;

/*
   A queue is a data structure that follows FIFO principle
   Here the insertion(Enqueue) is done from the last
   while the deletion(Dequeue) is done from the first
 */
public interface Queue<E> {
    void enqueue(E e);
    E dequeue();
    int size();
    E front();
    boolean isEmpty();
}
