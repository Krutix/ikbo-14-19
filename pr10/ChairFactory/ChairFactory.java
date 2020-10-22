package pr10.ChairFactory;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public VictorianChair createVictorainChair() {
        return new VictorianChair(10);
    }
}
