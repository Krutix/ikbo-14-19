package pr11.expression.operations;

public class Divide extends Operation {
    public Divide(IExpression fir, IExpression sec) {
        super(fir, sec);
    }

    @Override
    public int getValue() throws Exception {
        return Math.floorDiv(fir.getValue(), sec.getValue());
    }

    @Override
    public String toStringExpr() {
        return fir.toStringExpr() + " / " + sec.toStringExpr();
    }
}
