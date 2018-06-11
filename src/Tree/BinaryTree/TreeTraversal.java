package Tree.BinaryTree;

import ListADT.Position;

/**
 * @author : codedsun
 * Created on 10/Jun/2018
 */



/*
   Class for Tree Traversal for Inorder, PreOrder, PostOrder
   For Example : + is root,
                 A is left child, B is right child
   @Inorder - Left Root Right (A+B)
   @PreOrder - Root Left Right (+AB)
   @PostOrer - Left Right Root (AB+)
 */

public class TreeTraversal<E> {
    private void PreOrderTraversal(Position<E> position) {

    }

    private void PostOrderTraversal(Position<E> position) {

    }

    public static void main(String[] args) {

        LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<>();
        tree.addRoot(1);
        tree.addLeft(tree.root, 2);
        tree.addRight(tree.root, 3);
        TreeTraversal<Integer> treeTraversal = new TreeTraversal<>();
        treeTraversal.PreOrderTraversal(tree.root);
    }
}
