package Stack;

/*
 An array based implementation of Stack
 */
public class ArrayStack<E> implements Stack<E> {

    private E data[];
    private int CAPACITY = 1000;
    private int top = -1;

    ArrayStack(int CAPACITY){
        this.CAPACITY = CAPACITY;
        data = (E[]) new Object[CAPACITY];
    }
    ArrayStack(){
        this(1000);
    }


    @Override
    public int size() {
        return top+1;
    }

    @Override
    public void push(E e) {
        if(top == CAPACITY)
            new Exception("Stack is Full");
        else
            data[++top] = e;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            return null;
        }
        else {
            E element = data[top];
            data[top] = null;
            top--;
            return element;
        }

    }

    @Override
    public boolean isEmpty() {
        return top==-1;
    }

    @Override
    public E top() {
        return data[top];
    }
}
