package CompetetiveProgramming.GeeksForGeeks.LinkedList;

public class DeleteAKey {

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

    void deleteKey(int data){
        if(size == 0 ) throw new IllegalStateException("No Such Element");
        else{
            Node h = head;
            Node prev = null;
            while( h.data != data && h!=null){
                prev = h;
                h = h.next;
            }
            prev.next = prev.next.next;
        }

    }

    void printList(){
        Node h = head;
        while(h!=null){
            System.out.println(h.data);
            h = h.next;
        }
    }

    public static void main(String[] args) {
        DeleteAKey deleteAKey = new DeleteAKey();
        deleteAKey.addLast(2);
        deleteAKey.addLast(4);
        deleteAKey.addLast(3);
        deleteAKey.addLast(5);
        deleteAKey.deleteKey(3);
        deleteAKey.printList();
    }


}


