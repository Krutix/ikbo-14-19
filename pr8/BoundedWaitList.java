package pr8;

import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int maxSize)
    {
        super();
        this.capacity = maxSize;
    }

    public BoundedWaitList(int maxSize, Collection<E> waitList)
    {
        super();
        this.capacity = maxSize;
        for (E el : waitList)
            this.add(el);
    }

    public int getCapacity()
    {
        return capacity;
    }

    @Override
    public void add(E elem)
    {
        if (waitList.size() >= capacity)
            waitList.remove();
        waitList.offer(elem);
    }
}
