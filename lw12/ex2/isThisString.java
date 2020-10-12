package lw12.ex2;

import java.util.Scanner;
import java.util.regex.*;

public class isThisString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sample = "abcdefghijklmnopqrstuv18340";
        String str = scanner.nextLine();
        if (Pattern.matches(sample, str))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
