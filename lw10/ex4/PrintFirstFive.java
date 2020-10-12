package lw10.ex4;

import javax.xml.catalog.Catalog;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class PrintFirstFive {
    public static <E> void printFirstFive(Collection<E> catalog)
    {
        E[] array = (E[]) catalog.toArray();
        for (int i = 0; i < 5 && i < array.length; i++)
            System.out.println(array[i]);
    }

    public static void main(String[] args) {
        LinkedList<String> array = new LinkedList<>();
        array.addLast("abs");
        array.addLast("kde");
        array.addLast("0");
        array.addLast("0");
        array.addLast("0");
        array.addLast("0");
        printFirstFive(array);
    }
}
