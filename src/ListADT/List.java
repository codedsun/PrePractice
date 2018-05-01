package ListADT;

/**
 * @author : codedsun
 * Created on 01/May/2018
 */

/**
 *
 * @param <E> For Generic ADT
 *
 *
 */

public interface List<E> {
    boolean isEmpty();
    int getSize();
    E set(int i, E e);
    E get(int index);
    void add(int i, E e);
    E remove(int i);
}
