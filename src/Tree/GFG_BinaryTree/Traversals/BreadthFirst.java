package Tree.GFG_BinaryTree.Traversals;

/**
 * @author : codedsun
 * Created on 27/07/18
 */


import Queue.LinkedQueue;
import Queue.Queue;

/**
 * Also known as level first traversal
 */
public class BreadthFirst {

    static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;

        }
    }

    static void breadthFirst(Node tree){
        Queue<Node> q = new LinkedQueue<Node>();
        q.enqueue(tree);
        while(q != null){
            Node temp = q.dequeue();
            System.out.println(temp.data);
            if(temp.left != null){
                q.enqueue(temp.left);
            }
            if(temp.right != null){
                q.enqueue(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        breadthFirst(root);
    }

}
