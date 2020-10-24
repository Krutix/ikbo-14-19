package pr11.expression;

import pr11.expression.exception.NullInitializeVariable;
import pr11.expression.operations.*;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Scanner;

public class Application {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IExpression expression = null;
        boolean bExpression = false;
        while (true) {
            if (!bExpression) {
                try {
                    ExpressionParser parser = new ExpressionParser();
                    System.out.print("Enter the expression: ");
                    expression = parser.parse(scanner.nextLine());
                    bExpression = true;
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                continue;
            }
            System.out.println("Enter:\n[value]\t\t\t-\tto calculate expression");
            System.out.println("[show]\t\t\t-\tto show current expression");
            System.out.println("[re]\t\t\t-\tto change current expression");
            System.out.println("[key value]+\t-\tto evaluate current expression");
            String input = scanner.nextLine();
            System.out.println("==================================");
            switch (input) {
                case "value":
                    try {
                        System.out.println(expression.toStringExpr() + " = " + expression.getValue());

                    } catch (NullInitializeVariable e) {
                        System.out.println("Variable not initialize");
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                    break;
                case "show":
                    System.out.println(expression.toStringExpr());
                    break;
                case "re":
                    bExpression = false;
                    break;
                default:
                    expression.evaluate(ExpressionParser.parseEvaluate(input));
            }
            System.out.println("==================================");
        }
    }
}
