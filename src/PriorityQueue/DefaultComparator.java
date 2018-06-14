package PriorityQueue;

import java.util.Comparator;

/**
 * @author : codedsun
 * Created on 14/06/18
 */
public class DefaultComparator<E> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) throws ClassCastException {
        return ((Comparable<E>) o1).compareTo(o2);
    }
}
