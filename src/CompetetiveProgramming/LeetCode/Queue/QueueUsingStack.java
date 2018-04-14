package CompetetiveProgramming.LeetCode.Queue;

public class QueueUsingStack {

        private class Node {
            int element;
            Node next;
            Node(int element, Node next){
                this.element = element;
                this.next = next;
            }
            public int getElement(){
                return element;
            }
            public void setElement(int element){
                this.element = element;
            }
            public void setNext(Node next){
                this.next = next;
            }
            public Node getNext(){
                return next;
            }

        }

        Node head ;
        Node tail ;
        int size ;


        /** Initialize your data structure here. */
        public QueueUsingStack() {
            head = null;
            tail = null;
            size = 0;

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            Node nexest = new Node(x,null);
            if(empty()){
                tail = head = nexest;
            }
            else{
                tail.setNext(nexest);
                tail = nexest;
                size++;
            }
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            int element = head.getElement();
            head = head.getNext();
            return element;
        }

        /** Get the front element. */
        public int peek() {
            return head.getElement();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return size==0;
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

