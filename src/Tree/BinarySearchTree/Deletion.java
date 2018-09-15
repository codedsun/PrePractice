package Tree.BinarySearchTree;

/**
 * @author : codedsun
 * Created on 15/09/18
 */

/**
 * BST Deletion is way more difficult process than
 */
public class Deletion {

    class Node {
        Node left;
        Node right;
        int element;

        Node(int element) {
            this.element = element;
        }
    }

    Node root;

    Deletion() {
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

    public static void main(String[] args) {
        Deletion tree = new Deletion();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inOrder(tree.root);
        tree.deleteNode(tree.root, 20);
        System.out.println("After Deletion");
        tree.inOrder(tree.root);

    }

    Node deleteNode(Node root, int element) {
        //The method uses the process of recursion to delete the node
        if (root == null) {
            return root;
        }

        if (element < root.element) {
            root.left = deleteNode(root.left, element);
        } else if (element > root.element) {
            root.right = deleteNode(root.right, element);
        } else {
            //this is the node to be deleted

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }
            //You can go with either predecessor or successor depending on the availability
            root.element = findMax(root.left);
//            root.element = findMin(root.right);

            //if you have replaced the predecessor, then delete that predecessor
            root.left = deleteNode(root.left, root.element);
        }

        return root;
    }

    //Find max value less than root
    int findMax(Node root) {
        int max = root.element;
        while (root.right != null) {
            max = root.element;
            root = root.right;
        }
        return max;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.println(root.element);
            inOrder(root.right);
        }
    }


}
