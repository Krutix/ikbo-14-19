package lw12.ex1;

import java.util.Scanner;
import java.util.regex.*;

public class Split {
    public static String[] toArray(String toParse, String spl)
    {
        Pattern split = Pattern.compile(spl);
        return split.split(toParse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toParse = scanner.nextLine();
        String spl = scanner.nextLine();
        String[] list = toArray(toParse, spl);
        for (String elem : list)
            System.out.println(elem);
    }
}
