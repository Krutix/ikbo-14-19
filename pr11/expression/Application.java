package pr11.expression;

import pr11.expression.operations.*;

import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (scanner.hasNextLine()) {
            try {
                ExpressionParser.clean();
                IExpression expression = ExpressionParser.parse(scanner.nextLine());
                System.out.println("Value: " + expression.toStringExpr());
            }
            catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
