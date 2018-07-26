package Tree.GFG_BinaryTree.Introduction;

/**
 * @author : codedsun
 * Created on 27/07/18
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * A class to check the tree is symmetric or not
 *       1
 *     /   \
 *    2     2
 *   / \   / \
 *  3   4 4   3
 *
 *  is symmetric
 */

//TODO @codedsun

public class SymmetricTree {

    class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    boolean Symmetric(Node tree) {
        Queue<Node> q = new LinkedList<>();
        while(!q.isEmpty()){
            Node temp = q.remove();
            if(temp.left == null || temp.right == null){
                return true;
            }
            else{
                if(temp.right == temp.left){
                    return true;

                }
                else{

                }
            }
        }
        return true;
    }
}
