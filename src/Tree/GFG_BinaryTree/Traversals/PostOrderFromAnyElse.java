package Tree.GFG_BinaryTree.Traversals;

/**
 * @author : codedsun
 * Created on 27/07/18
 */

/**
 * This is used to print the postOrder from the given preOrder and inOrder traversals
 * The approaches are two,
 * 1. The naive method is to construct the tree, and then print the postOrder
 * 2. The other is to find the postOrder logically using the recursion calls
 */

//@TODO : NOT COMPLETED
public class PostOrderFromAnyElse {
    private int root = -1;
    int key = 0;
    /*
     Used for searching the key in a[] array

     */
    private int search(int a[], int key, int size) {

        for (int i = 0; i < size; i++) {
            if (a[i] == key) {
                return i;
            }

        }
        return -1;
    }

    private void postOrderPrint(int inorder[], int preOrder[], int size) {

        //Used to find the root value in order and then search the left and right subtrees accordingly
        root = search(inorder, preOrder[key], size);

        //This means that their is left subtree to be traversed
        if(root != 0){
           // postOrderPrint(inorder,root[key+1]);
        }
    }
}
