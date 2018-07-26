package Tree.GFG_BinaryTree.Introduction;

/**
 * @author : codedsun
 * Created on 21/07/18
 */



import java.util.LinkedList;
import java.util.Queue;

/**
 * A continuous tree is a tree in which the path from root to leaf is considered and adjacent nodes
 * have difference  = 1
 * <p>   1    </p>
 * <p>  / \   </p>
 * <p> 2   3  </p>
 * <p> --  -- </p>
 * Path 1->2 difference is 1
 * Path 1->3 difference is 3
 */
public class ContinousTree {

    private static class Node {
        int data;
        Node left;
        Node right;
    }

    Node root = null;
    Node temp;

    boolean checkContinous(Node root) {
        //corner cases
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return false;
        }
        else{

        }
        return true;

    }
}
