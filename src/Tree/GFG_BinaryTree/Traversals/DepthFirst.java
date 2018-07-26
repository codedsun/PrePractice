package Tree.GFG_BinaryTree.Traversals;

/**
 * @author : codedsun
 * Created on 27/07/18
 */

/**
 * Traversal are of three types
 * 1. Inorder(Left, Root, Right)
 * 2. PostOrder(Left, Right, Root)
 * 3. PreOrder(Root, Left, Right)
 */
public class DepthFirst {
    Node tree = null;
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        DepthFirst depthFirst = new DepthFirst();
        depthFirst.tree = new Node(1);
        depthFirst.tree.left = new Node(4);
        depthFirst.tree.right = new Node(5);
        depthFirst.inOrder(depthFirst.tree);
        depthFirst.preOrder(depthFirst.tree);
        depthFirst.postOrder(depthFirst.tree);
    }

    private void inOrder(Node tree) {
        if (tree != null) {
            inOrder(tree.left);
            System.out.print(tree.data + " ");
            inOrder(tree.right);
        }

    }

    private void preOrder(Node tree) {
        if (tree != null) {
            System.out.print(tree.data + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }


    }

    private void postOrder(Node tree) {
        if (tree != null) {
            postOrder(tree.left);
            postOrder(tree.right);
            System.out.print(tree.data + " ");

        }
    }
}
