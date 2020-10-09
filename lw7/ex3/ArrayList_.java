package lw7.ex3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_<E> implements List<E> {
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

    @Override
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

    @Override
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

    @Override
    public boolean add(E e) {
        add(size, e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size)
            return null;
        E tbh = array[index];
        array[index] = element;
        return tbh;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++)
            if (o.equals(array[i]))
                return true;
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] tbh = new Object[size];
        for (int i = 0; i < size; i++)
            tbh[i] = array[i];
        return tbh;
    }

    @Override
    public E get(int index) {
        if (index < size && index >= 0)
            return array[index];
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++)
            if (o.equals(array[i]))
                return i;
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < size; i++)
            if (o.equals(array[i]))
                lastIndex = i;
        return lastIndex;
    }


    @Override
    public void clear() {

    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
