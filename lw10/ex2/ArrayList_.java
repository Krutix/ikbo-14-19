package lw10.ex2;

public class ArrayList_<E> {
    private E[] array;
    private int size;
    private int reserve;

    public ArrayList_()
    {
        reserve = 4;
        size = 0;
        resize(reserve);
    }

    public void resize(int new_reserve)
    {
        E[] new_array = (E[]) new Object[new_reserve];
        if (size > new_reserve)
            size = new_reserve;
        for (int i = 0; i < size; i++)
            new_array[i] = array[i];
        array = new_array;
        reserve = new_reserve;
    }

    public void add(int index, E element) {
        if (index < 0)
            index = 0;
        else if (index > size)
            index = size;
        if (++size > reserve)
            resize(reserve * 2);
        for (int i = size - 1; i > index; --i)
            array[i] = array[i - 1];
        array[index] = element;
    }

    public E remove(int index) {
        if (index < size && index >= 0) {
            E tbh = array[index];
            for (int i = index + 1; i < size; i++)
                array[i - 1] = array[i];
            size--;
            return tbh;
        }
        return null;
    }

    public boolean add(E e) {
        add(size, e);
        return true;
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size)
            return null;
        E tbh = array[index];
        array[index] = element;
        return tbh;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++)
            if (o.equals(array[i]))
                return true;
        return false;
    }

    public Object[] toArray() {
        Object[] tbh = new Object[size];
        for (int i = 0; i < size; i++)
            tbh[i] = array[i];
        return tbh;
    }

    public E get(int index) {
        if (index < size && index >= 0)
            return array[index];
        return null;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++)
            if (o.equals(array[i]))
                return i;
        return -1;
    }

    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < size; i++)
            if (o.equals(array[i]))
                lastIndex = i;
        return lastIndex;
    }

    public void clear() {
        size = 0;
    }
}
