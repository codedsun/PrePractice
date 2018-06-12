package Tree.BinaryTree;

import ListADT.Position;

import java.util.function.Consumer;

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
    LinkedBinaryTree<Integer> tree;
    private void PreOrderTraversal() {
            tree.positions().forEach(new Consumer<Position<Integer>>() {
                @Override
                public void accept(Position<Integer> integerPosition) {
                    System.out.println(integerPosition);
                }
            });
    }

    private void PostOrderTraversal(Position<E> position) {

    }

    public static void main(String[] args) {


        tree = new LinkedBinaryTree<>();
        tree.addRoot(1);
        tree.addLeft(tree.root, 2);
        tree.addRight(tree.root, 3);
        TreeTraversal<Integer> treeTraversal = new TreeTraversal<>();
        treeTraversal.PreOrderTraversal(tree.root);
    }
}
