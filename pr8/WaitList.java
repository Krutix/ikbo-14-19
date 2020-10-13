package pr8;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public class WaitList<E> implements IWaitList<E>{
    protected Queue<E> waitList;

    public WaitList()
    {
        waitList = new ArrayDeque<>();
    }

    public WaitList(Collection<E> collection)
    {
        waitList = new ArrayDeque<>(collection);
    }

    @Override
    public void add(E elem) {
        waitList.offer(elem);
    }

    @Override
    public E remove() {
        return waitList.poll();
    }

    @Override
    public boolean contains(E elem) {
        return waitList.contains(elem);
    }

    @Override
    public boolean containsAll(Collection<E> collect) {
        return waitList.containsAll(collect);
    }

    @Override
    public int size() {
        return waitList.size();
    }

    @Override
    public boolean isEmpty() {
        return waitList.isEmpty();
    }

    @Override
    public String toString() {
        return waitList.toString();
    }
}
