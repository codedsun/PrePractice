package LinkedList;

/*
    CircularLinkedList Implementation
    @author : codedsun
    @date : 02/April/2018
 */
public class CircularLinkedList<E> {
    public static class Node<E> {

        private E element;
        private Node<E> next;

        Node(E element, Node<E> next){

            this.element = element;
            this.next = next;

        }
        public Node<E> getNext(){
            return next;
        }

        public E getElement(){
            return element;
        }

        public void setElement(E e){
            this.element = e;
        }

        public void setNext(Node<E> next){
            this.next = next;
        }

    }

    private Node<E> tail;
    private static int size = 0;
    CircularLinkedList(){}

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public E first(){
        if(isEmpty()) return null;
        else
            return tail.getNext().getElement();
    }

    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }

    public void rotate(){
        if(!(isEmpty())) tail = tail.getNext();
    }

    public void addFirst(E e){
        if(isEmpty()){
            tail = new Node(e, tail);
        }
        else {
            Node<E> newest = new Node(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;

    }

    public void addLast(E e){
        if(isEmpty()) tail = new Node(e, tail);
        else{
            Node<E> newest = new Node(e, tail.getNext());
            tail.setNext(newest);
            tail = newest;
        }
        size++;
    }

    public void print(){
        if(!isEmpty()) {
            Node<E> node = tail.getNext();
            while(node!=null){
                System.out.println(node.getElement());
                node = node.getNext();
            }
        }
    }
}
