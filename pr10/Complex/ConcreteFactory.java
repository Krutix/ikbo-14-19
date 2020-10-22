package pr10.Complex;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        Complex c = new Complex();
        c.r = 0;
        c.i = 0;
        return c;
    }

    @Override
    public Complex createComplex(double r, double i) {
        Complex c = new Complex();
        c.r = r;
        c.i = i;
        return c;
    }
}
