package lw10.ex3;

import java.util.Collection;
import java.util.LinkedList;

public class GetElement {
    public static <E> E getElement(Collection<E> array, int index)
    {
        if (index >= 0 && index < array.size())
            return (E) array.toArray()[index];
        return null;
    }


    public static void main(String[] args) {
        LinkedList<String> array = new LinkedList<>();
        array.addLast("abs");
        array.addLast("kde");
        array.addLast("0");
        System.out.println(getElement(array, 0));
    }
}
