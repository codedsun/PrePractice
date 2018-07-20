package Tree.GFG_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : codedsun
 * Created on 19/07/18
 */
public class TreeInsertion {

    static Node root = null;
    static Node temp = root;

    static void insert(Node temp, int key) {
        Queue<Node> q = new LinkedList<>();
        q.add(temp);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            }
        }

    }

    static void inOrderTraversal(Node temp) {

        if (temp == null)
            return;
        inOrderTraversal(temp.left);
        System.out.println(temp.key);
        inOrderTraversal(temp.right);
    }


        public static void main (String[]args){
            root = new Node(10);
            root.left = new Node(11);
            root.left.left = new Node(7);
            root.right = new Node(9);
            root.right.left = new Node(15);
            root.right.right = new Node(8);
            System.out.println("BEFORE INSERTION");
            inOrderTraversal(root);

            System.out.println("AFTER INSERTION");
            insert(root, 12);
            inOrderTraversal(root);


        }
    }
