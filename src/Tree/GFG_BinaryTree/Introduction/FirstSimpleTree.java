package Tree.GFG_BinaryTree.Introduction;

/**
 * @author : codedsun
 * Created on 19/07/18
 */
public class FirstSimpleTree {

    Node root;

    FirstSimpleTree(int key) {
        root = new Node(key);
    }

    public static void main(String[] args) {
        FirstSimpleTree fst = new FirstSimpleTree(1);
        fst.root.left = new Node(2);
        fst.root.right = new Node(3);
        fst.root.left.left = new Node(4);
    }
}
