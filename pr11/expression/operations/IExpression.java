package pr11.expression.operations;

import java.util.HashMap;

public interface IExpression {
    void evaluate(String key, int value);
    void evaluate(HashMap<String, Integer> params);
    int getValue() throws Exception;
}
