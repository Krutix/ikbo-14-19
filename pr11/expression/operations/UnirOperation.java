package pr11.expression.operations;

import pr11.expression.operations.IExpression;

import java.util.HashMap;

public abstract class UnirOperation implements IExpression {
    protected IExpression contain;

    public UnirOperation(IExpression contain) {
        this.contain = contain;
    }

    @Override
    public void evaluate(String key, int value) {
        contain.evaluate(key, value);
    }

    @Override
    public void evaluate(HashMap<String, Integer> params) {
        contain.evaluate(params);
    }

    @Override
    abstract public int getValue() throws Exception;
}
