package pr11.expression.operations;

public class Divide extends Operation {
    public Divide(IExpression fir, IExpression sec) {
        super(fir, sec);
    }

    @Override
    public int getValue() throws Exception {
        return fir.getValue() / sec.getValue();
    }
}
