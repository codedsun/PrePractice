package LinkedList;

public class DoublyLinkedList<E> {

    public static class Node<E> {
        private Node<E> prev;
        private Node<E> next;
        private E element;
        Node(E element, Node<E> prev, Node<E> next){
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public Node<E> getPrev(){
            return prev;
        }
        public void setPrev(Node<E> prev){
            this.prev = prev;
        }
        public void setNext(Node<E> next){
            this.next = next;
        }
    }

    private Node<E> header;
    private Node<E> trailer;
    private static int SIZE = 0;

    DoublyLinkedList(){
        header = new Node(null, null,null);
        trailer = new Node(null, header, null);
        header.setNext(trailer);
        SIZE = 0;//Just for fun :D
    }

    public int getSize(){
        return SIZE;
    }

    public boolean isEmpty(){
        return SIZE==0;
    }

    public E first(){
        return header.getNext().getElement();
    }

    public E last(){
        return trailer.getPrev().getElement();
    }

    public void addFirst(E element) {
        Node<E> node = new Node(element, header, header.getNext());
        header.getNext().setPrev(node);
        header.setNext(node);
        SIZE++;
    }

    public void addLast(E element){
        Node<E> node = new Node(element, trailer.getPrev(), trailer);
        trailer.getPrev().setNext(node);
        trailer.setPrev(node);
        SIZE ++;
    }

    public void removeFirst(){
        if(isEmpty()) return;
        Node<E> next = header.getNext().getNext();
        header.setNext(next);
        next.setPrev(header);
        SIZE -- ;

    }

    public void removeLast(){
        if(isEmpty()) return;
        Node<E> prev = trailer.getPrev().getPrev();
        trailer.setPrev(prev);
        prev.setNext(trailer);
        SIZE --;
    }

    public void print(){
        Node<E> head = header.getNext();
        while(head!=null && head !=trailer){
            System.out.println(head.getElement());
            head = head.getNext();

        }
    }
}
