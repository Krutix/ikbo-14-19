package lw10.ex1;

import java.util.LinkedList;

public class TestToList {
    public static void main(String[] args) {
        String[] k = new String[3];
        k[0] = "aaa";
        k[1] = "bbbb";
        k[2] = "cc";
        LinkedList<String> arrayTest = ToList.toList(k);
        for (String element : arrayTest)
            System.out.println(element);
    }
}
