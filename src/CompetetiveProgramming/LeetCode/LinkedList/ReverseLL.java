package CompetetiveProgramming.LeetCode.LinkedList;

public class ReverseLL<E> {
    public static class Node<E> {

        private Node<E> next;
        private E element;

        Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }

        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> next){
            this.next = next;
        }
        public void setElement(E e){
            this.element = element;
        }

    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private static int size = 0;

    public boolean isEmpty(){
        return size==0;
    }

    public E first(){
        if(isEmpty()) return null;
        return head.getElement();
    }

    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        Node<E> newest = new Node(e, head);
        head = newest;
        if(size == 0)
            tail = newest;
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node(e,null);
        if(size == 0){
            head = tail = newest;
        }
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public void removeFirst(){
        if(isEmpty()) return;
        head = head.getNext();
        size--;

    }
    /*
     An Awesome method for reversing linked list
     */
    public void reverse(){
        Node<E> newHead = null;
        while(head!=null){
            Node<E> next = head.getNext();
            head.next = newHead;
            newHead = head;
            head = next;
        }
        head = newHead;
        printList();
    }
    public void printList(){
        Node<E> node = head;
        while(node!=null){
            System.out.print(node.getElement()+" ");
            node = node.getNext();
        }
    }
}
