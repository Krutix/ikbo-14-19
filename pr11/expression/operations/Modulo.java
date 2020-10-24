package pr11.expression.operations;

public class Modulo extends Operation {
    public Modulo(IExpression fir, IExpression sec) {
        super(fir, sec);
    }

    @Override
    public int getValue() throws Exception {
        return Math.floorMod(fir.getValue(), sec.getValue());
    }

    @Override
    public String toStringExpr() {
        return fir.toStringExpr() + " % " + sec.toStringExpr();
    }
}
