package Tree.BinarySearchTree;

/**
 * @author : codedsun
 * Created on 15/09/18
 */

/**
 * A binary search tree is a data structure that can grow upto a great height and inseriton and deletion can be
 * performed easily. The tree follows property of that left side is less than the root and the right is greater that
 * to root. No duplication of keys
 */
public class BinarySearchTreeInsertion {

    class Node {
        Node left;
        Node right;
        int element;

        Node(int item) {
            this.element = item;
        }
    }

    Node root;

    BinarySearchTreeInsertion() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.element) {
           root.left =  insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.element);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeInsertion tree = new BinarySearchTreeInsertion();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inOrder(tree.root);

    }
}
