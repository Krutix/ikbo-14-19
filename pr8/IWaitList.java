package pr8;

import java.util.Collection;

public interface IWaitList<E> {
    void add(E elem);
    E remove();
    boolean contains(E elem);
    boolean containsAll(Collection<E> collect);
    int size();
    boolean isEmpty();
}
