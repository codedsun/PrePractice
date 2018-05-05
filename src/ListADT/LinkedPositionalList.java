package ListADT;

/**
 * @author : codedsun
 * Created on 05/May/2018
 * @param <E>
 */

public class LinkedPositionalList<E> implements PositionalList<E> {

    private static class Node<E> implements Position<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public E getElement() throws IllegalStateException {
            if(next == null){
                throw new IllegalStateException("Position is no longer valid");
            }
            else
                return element;
        }

        public Node<E> getPrev(){
            return prev;
        }

        public Node<E> getNext(){
            return next;
        }

        public void setElement(E e){
            this.element = e;
        }

        public void setPrev(Node<E> p) {
            this.prev = p;
        }

        public void setNext(Node<E> n){
            this.next = n;
        }

    }

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public LinkedPositionalList(){
        header = new Node<>(null,null,null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    private Node<E> validate(Position<E> p) throws IllegalArgumentException{
        if(!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");
        Node<E> node = (Node<E>)p;
        if(node.getNext() == null) throw new IllegalArgumentException("p is no longer in the list");
        return node;
    }

    private Position<E> position(Node<E> node){
        if(node == header || node == trailer)
            return null;
        else
            return node;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public Position<E> first() {
        return position(header.getNext());
    }

    @Override
    public Position<E> last() {
        return position(trailer.getPrev());
    }

    @Override
    public Position<E> before(Position<E> p) throws IllegalStateException {
        Node<E> node = validate(p);
        return position(node.getPrev());
    }

    @Override
    public Position<E> after(Position<E> p) throws IllegalStateException {
        Node<E> node = validate(p);
        return position(node.getNext());
    }


    private Position<E> addBetween(E e, Node<E> prev, Node<E> next){
        Node<E> n = new Node<>(e,prev,next);
        prev.setNext(n);
        next.setPrev(n);
        size++;
        return n;
    }

    @Override
    public Position<E> addFirst(E e) {
        return addBetween(e,header,header.getNext());
    }

    @Override
    public Position<E> addLast(E e) {
        return addBetween(e,trailer.getPrev(),trailer);
    }

    @Override
    public Position<E> addBefore(Position<E> p, E e) throws IllegalStateException {
        Node<E> n = validate(p);
        return addBetween(e,n.getPrev(),n);
    }

    @Override
    public Position<E> addAfter(Position<E> p, E e) throws IllegalStateException {
        Node<E> n = validate(p);
        return addBetween(e,n,n.getNext());
    }

    @Override
    public E set(Position<E> p, E e) throws IllegalStateException {
        Node<E> n = validate(p);
        E element = n.getElement();
        n.setElement(e);
        return element;
    }

    @Override
    public E remove(Position<E> p) {
        Node<E> n = validate(p);
        E element = n.getElement();
        Node<E> prev = n.getPrev();
        Node<E> next = n.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        size --;
        n.setNext(null);n.setElement(null);
        n.setPrev(null);
        return element;
    }
}

class ImplementPositionalList{
    public static void main(String[] args) {
        LinkedPositionalList<String> s = new LinkedPositionalList<>();
        s.addFirst("Suneet");
        System.out.println(s.first().getElement());

    }
}
