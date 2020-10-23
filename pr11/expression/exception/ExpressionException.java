package pr11.expression.exception;

public class ExpressionException extends Exception {
    public ExpressionException(String error)
    {
        super("Expression exception: " + error);
    }
}
