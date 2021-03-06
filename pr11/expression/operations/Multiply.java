package pr11.expression.operations;

public class Multiply extends Operation {
    public Multiply(IExpression fir, IExpression sec) {
        super(fir, sec);
    }

    @Override
    public int getValue() throws Exception {
        return Math.multiplyExact(fir.getValue(), sec.getValue());
    }

    @Override
    public String toStringExpr() {
        return fir.toStringExpr() + " * " + sec.toStringExpr();
    }
}
