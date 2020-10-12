package lw12.ex3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IsCost {
    private static boolean isRightCost(String costStr)
    {
        if (Pattern.matches("\\d*(\\.\\d\\d)? ((EU)|(USD)|(RUB))", costStr))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())
            System.out.println(isRightCost(scanner.nextLine()));
    }
}
