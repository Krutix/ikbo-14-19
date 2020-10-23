package pr11.expression.operations;

import pr11.expression.exception.NullInitializeVariable;
import pr11.expression.operations.IExpression;

import java.util.HashMap;

public class Variable implements IExpression {
    private String key;
    private Integer value;

    public Variable(String key) {
        this.key = key;
        value = null;
    }

    @Override
    public void evaluate(String key, int value) {
        if (this.key.compareTo(key) == 0)
            this.value = value;
    }

    @Override
    public void evaluate(HashMap<String, Integer> params) {
        if (params.containsKey(this.key))
            this.value = params.get(this.key);
    }

    @Override
    public int getValue() throws Exception {
        if (value == null)
            throw new NullInitializeVariable(key);
        return value;
    }
}
