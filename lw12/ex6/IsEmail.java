package lw12.ex6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IsEmail {
    private static boolean isEmail(String costStr)
    {
        if (Pattern.matches("[a-z\\d!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z\\d!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z\\d](?:[a-z\\d-]*[a-z0-9])?)+(\\.[a-z\\d](?:[a-z\\d-]*[\\da-z]))?", costStr))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())
            System.out.println(isEmail(scanner.nextLine()));
    }
}
