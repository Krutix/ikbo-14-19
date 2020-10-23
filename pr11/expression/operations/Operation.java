package pr11.expression.operations;

import pr11.expression.operations.IExpression;

import java.util.HashMap;

public abstract class Operation implements IExpression {
    protected IExpression fir, sec;

    public Operation(IExpression fir, IExpression sec){
        this.fir = fir;
        this.sec = sec;
    }

    @Override
    public void evaluate(String key, int value) {
        fir.evaluate(key, value);
        sec.evaluate(key, value);
    }

    @Override
    public void evaluate(HashMap<String, Integer> params) {
        fir.evaluate(params);
        sec.evaluate(params);
    }

    @Override
    abstract public int getValue() throws Exception;
}
