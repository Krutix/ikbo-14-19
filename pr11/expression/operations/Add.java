package pr11.expression.operations;

public class Add extends Operation {
    public Add(IExpression fir, IExpression sec) {
        super(fir, sec);
    }

    @Override
    public int getValue() throws Exception {
        return Math.addExact(fir.getValue(), sec.getValue());
    }

    @Override
    public String toStringExpr() {
        return fir.toStringExpr() + " + " + sec.toStringExpr();
    }
}
