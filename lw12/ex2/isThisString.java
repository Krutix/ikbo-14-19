package lw12.ex2;

import java.util.Scanner;
import java.util.regex.*;

public class isThisString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sample = "abcdefghijklmnopqrstuv18340";
        String str = scanner.nextLine();
        System.out.println(Pattern.matches(sample, str));
    }
}
