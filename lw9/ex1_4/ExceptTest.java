package lw9.ex1_4;

import java.util.Scanner;

public class ExceptTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter an integer ");
        while (true) {
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                exceptionDemo(i);
            }
            catch (NumberFormatException e) {
                System.out.println("Entered not a number");
            }
            catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
            catch (Exception e) {
                System.out.println("Error");
            }
            finally {
                System.out.print("Enter an integer ");
            }
        }
    }

    public static void exceptionDemo(int nb) {
        System.out.println(2 / nb);
    }
}
