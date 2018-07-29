package Tree.GFG_BinaryTree.Traversals;

/**
 * @author : codedsun
 * Created on 27/07/18
 */

/**
 * Morris Algorithm for Traversal in which the traversal inorder successor is printed
 * and the tree is changed but it's reverted back
 *
 * @see InOrderTraversalWithoutRecursion for previous
 * The one advantage is that, it doesn't causes any extra space
 */
public class InOrderWithoutStack {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        traversalMorris(root);
    }

    private static void traversalMorris(Node root) {
        Node current, pre;
        if (root == null) {
            return;
        }
        current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.println(current.data);
                current = current.right;
            } else {
                pre = current.left;
                while (pre.right != null && pre.right != current) {
                    pre = pre.right;
                }

                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                } else {
                    pre.right = null;
                    System.out.println(current.data + " ");
                    current = current.right;

                }
            }
        }

    }
}
