package pr11.expression;

import pr11.expression.operations.*;

import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (scanner.hasNextInt()) {
            IExpression expression = new Divide(new Multiply(new Const(200000), new Variable("x")), new Multiply (new Const(10000), new Variable("x")));
            expression.evaluate("x", scanner.nextInt());
            try {
                System.out.println(expression.getValue());
            }
            catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
