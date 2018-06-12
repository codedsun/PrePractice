package Tree;

/**
 * @author : codedsun
 * Created on 08/June/2018
 */

import ListADT.Position;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Base class for Tree Implementation, which has some core functionalities of
 * @see Tree defined.
 */
public abstract class AbstractTree<E> implements Tree<E>{

    @Override
    public boolean isInternal(Position<E> p) throws IllegalArgumentException {
        return numChildren(p)>0;
    }

    @Override
    public boolean isExternal(Position<E> p) throws IllegalArgumentException {
        return numChildren(p)==0;
    }

    @Override
    public boolean isRoot(Position<E> p) throws IllegalArgumentException {
        return p==root();
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public Iterable<Position<E>> positions() {
        return preOrder();
    }

    @Override
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    private class ElementIterator implements Iterator<E>{

        Iterator<Position<E>> positionIterator = positions().iterator();
        @Override
        public boolean hasNext() {
            return positionIterator.hasNext();
        }

        @Override
        public E next() {
            return positionIterator.next().getElement();
        }

        @Override
        public void remove() {
            positionIterator.remove();
        }
    }

    private void preOrderSubtree(Position<E> p, List<Position<E>> snapshot){
        snapshot.add(p);
        for(Position<E> children : children(p)){
            snapshot.add(children);
        }
    }

    private List<Position<E>> preOrder(){
        List<Position<E>> positions = new ArrayList<>();
        if(!isEmpty()){
            preOrderSubtree(root(),positions);
        }
        return positions;
    }
}

