package lw10.ex1;

import java.util.LinkedList;

public class ToList {
    public static <E> LinkedList<E> toList(E[] array)
    {
        LinkedList<E> newList = new LinkedList<E>();
        for (E element : array)
            newList.addLast(element);
        return newList;
    }
}
