package Tree.GFG_BinaryTree;

/**
 * @author : codedsun
 * Created on 24/07/18
 */

/**
 * An expression tree is a binary tree, in which each leaf node corresponds to
 * operand and else corresponds to operator
 */
public class ExpressionTreeConstruction {

    class Node {
        int data;
        Node left, right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {


    }

    static Node constructTree(){
        return null;

    }

    boolean isOperator(char c){
        //if(c == '+' ||)
        return true;
    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

}
