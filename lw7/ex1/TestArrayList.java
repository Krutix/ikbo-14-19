package lw7.ex1;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("German");
        arr.add("France");
        arr.add("Japan");
        for (String pr : arr)
            System.out.println(pr);
        System.out.println();
        arr.add("English");
        for (String pr : arr)
            System.out.println(pr);
        System.out.println();
        arr.set(1, "Denmark");
        arr.set(0, "Poland");
        for (String pr : arr)
            System.out.println(pr);
    }
}
