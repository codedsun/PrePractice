package Queue;

import LinkedList.SinglyLinkedList;

public class LinkedQueue<E> implements Queue<E> {
    SinglyLinkedList<E> singlyLinkedList = new SinglyLinkedList<>();

    @Override
    public void enqueue(E e) {
        singlyLinkedList.addLast(e);
    }

    @Override
    public E dequeue() {
        return singlyLinkedList.removeFirst();

    }

    @Override
    public int size() {
        return singlyLinkedList.getSize();
    }

    @Override
    public E front() {
        return singlyLinkedList.first();
    }

    @Override
    public boolean isEmpty() {
        return singlyLinkedList.isEmpty();
    }
}
