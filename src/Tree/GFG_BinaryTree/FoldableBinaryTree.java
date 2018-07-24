package Tree.GFG_BinaryTree;

/**
 * @author : codedsun
 * Created on 24/07/18
 */

/**
 * A foldable binary tree is a tree, which have mirror images in left/right subtree
 * <p>   1   </p>
 * <p>  / \   </p>
 * <p> 2   4 </p>
 * <p>
 *<p>   10  </p>
 *<p>  /  \ </p>
 *    7    15
 *   /      \
 *  9       11
 * <p>
 * What I think is mirror like mirror image of this / is \ hence it's foldable
 * or something, if left subtree has left child then right subtree should have right child then it's foldable
 */
public class FoldableBinaryTree {

    private static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }
    }

    Node root = null;
    Node temp;

    public static void main(String[] args) {
        FoldableBinaryTree tree = new FoldableBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.temp = tree.root;
        System.out.println(checkFoldable(tree.root));

    }

    static boolean checkFoldable(Node root){
        if(root == null){
            return true;
        }

        else return checkFoldableUtil(root.left, root.right);
    }

    static boolean checkFoldableUtil(Node left, Node right){

        if(left == null && right == null){
            return true;
        }
        else if(left == null || right == null){
            return false;
        }
        else return (checkFoldableUtil(left.left, right.right) && checkFoldableUtil(left.right, right.left));

    }


}
