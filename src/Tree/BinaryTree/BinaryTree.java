package Tree.BinaryTree;
/*
    @author : codedsun
    Created on 10/Jun/2018
 */

import ListADT.Position;
import Tree.Tree;

/*
    A binary tree which is an ordered tree which has max 2 nodes(children)
    @see(Tree).
 */
public interface BinaryTree<E> extends Tree<E> {
    Position<E> left(Position<E> p) throws IllegalArgumentException;

    Position<E> right(Position<E> p) throws IllegalArgumentException;

    Position<E> sibling(Position<E> p) throws IllegalArgumentException;

}
