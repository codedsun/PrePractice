package Tree.GFG_BinaryTree.Traversals;

/**
 * @author : codedsun
 * Created on 27/07/18
 */

import java.util.Stack;

/**
 * A method to traverse tree with InOrder and without recursion
 *
 * @see DepthFirst for InOrder Traversal with Recursion
 */
public class InOrderTraversalWithoutRecursion {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);

        inOrderWithoutRecursion(root);
    }

    private static void inOrderWithoutRecursion(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        stack.push(current);
        while (!stack.isEmpty()) {

            if (current != null) {
                stack.push(current);
                current = current.left;

            } else {
                current = stack.pop();
                System.out.println(current.data);
                current = current.right;
            }

        }

    }
}
