package CompetetiveProgramming.GeeksForGeeks.LinkedList;

/**
 * @author : codedsun
 * Created on 03/May/2018
 */

/*
Program to find length of linked list recursively
 */
public class LengthLL {

    static class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    void addLast(int data){
        Node n = new Node(data,null);
        if(size == 0){
            head = tail = n;

        }
        else {
            tail.setNext(n);
            tail = n;

        }
        size++;

    }

    int getSize(Node h){

        if(h==null){
            return 0;
        }
        else{
            return 1+getSize(h.next);
        }

    }

    public static void main(String[] args) {
        LengthLL ll = new LengthLL();
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(1);
        System.out.println(ll.getSize(ll.head));
    }

}
