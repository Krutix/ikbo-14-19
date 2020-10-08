package lw7.ex2;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.push("German");
        list.push("France");
        list.addLast("Japan");
        for (String pr : list)
            System.out.println(pr);
        System.out.println();
        list.push("English");
        for (String pr : list)
            System.out.println(pr);
        System.out.println();
        System.out.println(list.pop());
        System.out.println();
        list.add(1, "The Ukraine");
        list.add(4, "Poland");
        for (String pr : list)
            System.out.println(pr);
    }
}
