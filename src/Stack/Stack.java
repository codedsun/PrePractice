package Stack;

/*
    Stack is a data structure that follows FIFO principle or the LIFO principle
    @param E : for generics

 */
public interface Stack<E> {
    int size();
    void push(E e);
    E pop();
    boolean isEmpty();
    E top();
}
