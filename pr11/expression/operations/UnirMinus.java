package pr11.expression.operations;

public class UnirMinus extends UnirOperation {
    public UnirMinus(IExpression contain) {
        super(contain);
    }

    @Override
    public int getValue() throws Exception {
        return -contain.getValue();
    }
}
