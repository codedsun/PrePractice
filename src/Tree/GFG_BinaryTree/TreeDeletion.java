package Tree.GFG_BinaryTree;

import Tree.Tree;

/**
 * @author : codedsun
 * Created on 20/07/18
 */
public class TreeDeletion {

    private static Node root = null;
    private static Node temp;

    private static class Node {
        private int data;
        private Node parent;
        private Node left;
        private Node right;

        public Node(int data, Node parent, Node left, Node right) {
            this.data = data;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getData() {

            return data;
        }

        public Node getParent() {
            return parent;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    private static void insert(int key, Node temp) {
        if (root == null) {
            root = new Node(key, null, null, null);
        } else {
            if (temp.left == null) {
                temp.left = new Node(key, temp, null, null);

            } else if (temp.right == null) {
                temp.right = new Node(key, temp, null, null);
            }
        }
    }

    static Node last = null;

    private static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        temp = root;
        System.out.println(root.data);
        inOrder(root.right);
    }

    private static void delete(Node node, int key) {
        if (node != null && node.data == key) {

            node.data = temp.data;
            if (temp.getParent().getRight() == temp) {
                temp.getParent().setRight(null);
            } else {
                temp.getParent().setLeft(null);
            }

            temp.setLeft(node.left);
            temp.setRight(node.right);
            if (node.getParent() == null) {
                temp.setParent(null);
                node = temp;
            } else {
                if (node.getParent().getLeft() == node) {
                   node.getParent().setLeft(temp);
                } else {
                    node.getParent().setRight(temp);
                }
            }
            node = null;
            temp = null;
            inOrder(root);
            System.exit(0);


        }
        delete(node.left, key);
        delete(node.right, key);

    }


    public static void main(String[] args) {
        insert(1, null);
        insert(2, root);
        insert(3, root);
        insert(4, root.left);
        insert(5, root.left);
        insert(6, root.right);
        insert(7, root.right);
        inOrder(root);
        System.out.println("AFTER DELETE");
        delete(root, 2);


    }
}


