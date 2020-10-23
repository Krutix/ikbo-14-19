package pr11.expression.operations;

import java.util.HashMap;

public class Const implements IExpression {
    public int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public void evaluate(String key, int value) { }

    @Override
    public void evaluate(HashMap<String, Integer> params) { }

    @Override
    public int getValue() throws Exception {
        return value;
    }
}
