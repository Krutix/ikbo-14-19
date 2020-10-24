package pr11.expression.operations;

import pr11.expression.operations.IExpression;
import pr11.expression.operations.Operation;

public class Subtract extends Operation {
    public Subtract(IExpression fir, IExpression sec) {
        super(fir, sec);
    }

    @Override
    public int getValue() throws Exception {
        return fir.getValue() - sec.getValue();
    }

    @Override
    public String toStringExpr() {
        return fir.toStringExpr() + " - " + sec.toStringExpr();
    }
}
