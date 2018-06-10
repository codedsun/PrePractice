package Tree;

/**
 * @author : codedsun
 * Created on 08/June/2018
 */

import ListADT.Position;

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
}

