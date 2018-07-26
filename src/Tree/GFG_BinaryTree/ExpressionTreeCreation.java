package Tree.GFG_BinaryTree;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : codedsun
 * Created on 26/07/18
 */

/**
 * Class to creates an expression tree from the given postfix version
 */
public class ExpressionTreeCreation {

    static Node root;
    static Node parent;
    static Node leftChild;
    static Node rightChild;

    static class Node {
        char data;
        Node left;
        Node right;

        public Node(char data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public char getData() {
            return data;
        }

        public void setData(char data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        buildTree(s);
    }

    private static void buildTree(String s) {
        char c;
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            System.out.println(c);
            if (isOperator(c)) {
                rightChild = stack.pop();
                leftChild = stack.pop();
                parent = new Node(c, leftChild, rightChild);
                stack.push(parent);
            }
            else{
                stack.push(new Node(c, null, null));
            }
        }

        root = stack.pop();
        inOrder(root);

    }

    private static boolean isOperator(char c) {
        if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^'){
            return true;
        }
        else{
            return false;
        }

    }

    private static void inOrder(Node root){
        if(root!=null){
            return;
        }
        inOrder(root.getLeft());
        System.out.println(root.getData());
        inOrder(root.getRight());
    }
}
