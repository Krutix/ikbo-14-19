package pr11.expression;

import pr11.expression.operations.*;

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
                } catch (Exception ignored) { }
                continue;
            }
            System.out.println("Enter:\n'start'\t\t\t-\tto calculate expression");
            System.out.println("'show'\t\t\t-\tto show current expression");
            System.out.println("'re'\t\t\t-\tto change current expression");
            System.out.println("'key value'+\t-\tto evaluate current expression");
            String input = scanner.nextLine();
            try {
                switch (input) {
                    case "start":
                        System.out.println(expression.toStringExpr() + " = " + expression.getValue());
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
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
