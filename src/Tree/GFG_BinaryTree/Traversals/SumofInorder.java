package Tree.GFG_BinaryTree.Traversals;

/**
 * @author : codedsun
 * Created on 30/07/18
 */


import java.util.ArrayList;

/**
 * Program to implement sum of inorder predecessor and successor
 * <p>
 *        1
 *      /   \
 *     2     3
 *   /  \  /  \
 *  4   5  6   7
 * </p>
 */
public class SumofInorder {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static java.util.ArrayList<Integer> inOrderList = new ArrayList<>();

    static void inOrder(Node root) {
        if(root == null)
            return;
        inOrder(root.left);
        inOrderList.add(root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        inOrder(root);
        sumInOrder(root);
    }

    static int j = 0;
    static int pre = 0;
    static int post = 0;

    static void sumInOrder(Node root){
        if(root == null) {
            return;
        }
        sumInOrder(root.left);
        if(inOrderList.get(j) == root.data){
            if(j == 0  ){
                root.data = inOrderList.get(j+1);
                j++;
            }
            else if(j == inOrderList.size()-1){
                root.data = inOrderList.get(j-1);
                j++;
            }
            else {
                root.data = inOrderList.get(j-1) + inOrderList.get(j+1);
                j++;
            }
            System.out.println(root.data);

        }
        sumInOrder(root.right);
    }
}
