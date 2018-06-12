package Tree.BinaryTree;

/**
 * @author : codedsun
 * Created on 10/Jun/2018
 */

import ListADT.Position;
import Tree.AbstractTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract Binary tree is an abstract/base class for binary tree implementation
 *
 * @param <E>- Generic Type
 * @see AbstractTree for further reference.(same concept used here for binary tree)
 */
public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {

    public Position<E> sibling(Position<E> p) {
        Position<E> parent = parent(p);
        if (parent == null) return null;
        else if (p == left(p)) {
            return right(p);
        } else {
            return left(p);
        }
    }

    @Override
    public int numChildren(Position<E> p) throws IllegalArgumentException {
        if (isExternal(p)) return 0;
        int count = 0;
        if (left(p) != null) {
            count++;
        }
        if (right(p) != null) {
            count++;
        }
        return count;
    }

    @Override
    public Iterable<Position<E>> children(Position<E> parent) throws IllegalArgumentException {
        List<Position<E>> snapshot = new ArrayList<>(2);
        if (left(parent) != null) {
            snapshot.add(left(parent));
        }
        if (right(parent) != null) {
            snapshot.add(right(parent));
        }
        return snapshot;
    }

    public List<Position<E>> inOrder() {
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty()) {
            inOrderSubtree(root(), snapshot);
        }
        return snapshot;
    }

    private void inOrderSubtree(Position<E> position, List<Position<E>> snapshot) {
        if (left(position) != null) {
            inOrderSubtree(left(position),snapshot);
        }
        snapshot.add(position);
        if(right(position)!=null){
            inOrderSubtree(right(position),snapshot);
        }
    }

}
