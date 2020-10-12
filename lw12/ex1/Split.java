package lw12.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Split {
    public static ArrayList<String> toArray(String toParse, String delim)
    {
        StringTokenizer st = new StringTokenizer(toParse, delim);
        ArrayList<String> array = new ArrayList<>();
        while(st.hasMoreTokens())
            array.add(st.nextToken());
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toParse = scanner.nextLine();
        String delim = scanner.nextLine();
        List<String> list = toArray(toParse, delim);
        for (String elem : list)
            System.out.println(elem);
    }
}
