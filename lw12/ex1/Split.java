package lw12.ex1;

import java.util.Scanner;
import java.util.regex.*;

public class Split {
    public static String[] toArray(String toParse, String delim)
    {
        Pattern split = Pattern.compile(delim);
        return split.split(toParse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toParse = scanner.nextLine();
        String delim = scanner.nextLine();
        String[] list = toArray(toParse, delim);
        for (String elem : list)
            System.out.println(elem);
    }
}
