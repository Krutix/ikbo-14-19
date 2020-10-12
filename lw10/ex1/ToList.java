package lw10.ex1;

import java.util.LinkedList;
import java.util.List;

public class ToList {
    public static <E> List<E> toList(E[] array)
    {
        List<E> newList = new LinkedList<E>();
        for (E element : array)
            newList.add(element);
        return newList;
    }
}
