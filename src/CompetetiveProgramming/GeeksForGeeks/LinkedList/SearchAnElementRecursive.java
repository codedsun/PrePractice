package CompetetiveProgramming.GeeksForGeeks.LinkedList;

/**
 * @author : codedsun
 * Created on 03/May/2018
 */


public class SearchAnElementRecursive {
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

    int search(int k, Node head){
        if(head.data == k){
            return 1;
        }
        else
            return 1+search(k,head.next);
    }

    public static void main(String[] args) {
        SearchAnElementRecursive s = new SearchAnElementRecursive();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        System.out.println(s.search(2,s.head));


    }
}
