package ListADT;

/**
 * @author : codedsun
 * Created on 05/May/2018
 * @param <E>
 */
public interface Position<E> {
    E getElement() throws IllegalStateException;
}
