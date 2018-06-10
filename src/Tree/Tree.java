package Tree;

import ListADT.Position;

import java.util.Iterator;

/**
 * @author : codedsun
 * Created on 08/June
 *
 */

/**
 * The tree interface created which will be used in Abstract Class for base class that
 * can be used for tree implementation
 * @param <E>
 */
public interface Tree<E> extends Iterable<E> {
    Position<E> root();
    Position<E> parent(Position<E> parent);
    Iterable<Position<E>> children(Position<E> parent) throws IllegalArgumentException;
    int numChildren(Position<E> p) throws IllegalArgumentException;
    boolean isInternal(Position<E> p) throws IllegalArgumentException;
    boolean isExternal(Position<E> p) throws IllegalArgumentException;
    boolean isRoot(Position<E> p) throws IllegalArgumentException;
    int size();
    boolean isEmpty();
    Iterator<E> iterator();
    Iterable<Position<E>> positions();
}
