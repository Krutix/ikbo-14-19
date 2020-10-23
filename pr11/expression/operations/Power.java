package pr11.expression.operations;

import pr11.expression.operations.IExpression;
import pr11.expression.operations.Operation;

public class Power extends Operation {
    public Power(IExpression fir, IExpression sec) {
        super(fir, sec);
    }

    @Override
    public int getValue() throws Exception {
        int tbh = fir.getValue();
        int first = tbh;
        int power = sec.getValue();
        for (int i = 0; i < power; i++)
            tbh *= first;
        return tbh;
    }
}
