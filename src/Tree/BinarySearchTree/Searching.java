package Tree.BinarySearchTree;

/**
 * @author : codedsun
 * Created on 15/09/18
 */
public class Searching {

    class Node {
        Node left;
        Node right;
        int element;

        Node(int element) {
            this.element = element;
        }
    }

    Node root;

    Searching() {
        root = null;
    }

    void insert(int element) {
        root = insertNode(root, element);
    }

    Node insertNode(Node root, int element) {
        if (root == null) {
            root = new Node(element);
            return root;
        }

        if (element < root.element) {
            root.left = insertNode(root.left, element);
        } else {
            root.right = insertNode(root.right, element);
        }
        return root;
    }

    Node searching(Node root, int element) {
        if (root != null && root.element == element) {
            System.out.println(root.element + " Found");
            return root;
        } else if (element < root.element) {
            searching(root.left, element);
        } else {
            searching(root.right, element);
        }
        return null;
    }

    public static void main(String[] args) {
        Searching tree = new Searching();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.searching(tree.root, 20);
    }
}
