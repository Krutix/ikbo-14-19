package lw12.ex4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IsPlus {
    private static boolean isPlus(String str)
    {
        return Pattern.matches(".*\\d+\\s*\\+.*", str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())
            System.out.println(isPlus(scanner.nextLine()));
    }
}
