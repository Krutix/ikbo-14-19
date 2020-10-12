package lw12.ex7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidPassword {
    private static boolean isValidPassword(String pass)
    {
        if (Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}", pass))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())
            System.out.println(isValidPassword(scanner.nextLine()));
    }
}
