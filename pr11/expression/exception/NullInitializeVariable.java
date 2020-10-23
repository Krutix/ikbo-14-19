package pr11.expression.exception;

public class NullInitializeVariable extends ExpressionException {
    public NullInitializeVariable(String error) {
        super("Null initialize variable: " + error);
    }
}
