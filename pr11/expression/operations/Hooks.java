package pr11.expression.operations;

public class Hooks extends UnirOperation {
    IExpression contain;

    public Hooks(IExpression contain) {
        super(contain);
    }

    @Override
    public int getValue() throws Exception {
        return contain.getValue();
    }
}
