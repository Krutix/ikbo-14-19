package pr10.ChairFactory;

public interface AbstractChairFactory {
    FunctionalChair createFunctionalChair();
    MagicChair createMagicChair();
    VictorianChair createVictorainChair();
}
