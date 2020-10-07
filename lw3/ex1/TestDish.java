package lw3.ex1;

public class TestDish {
    public static void main(String[] argv)
    {
        Dish[] array = new Dish[5];
        array[0] = new Fork(1, "Little fork", false, true);
        array[1] = new Fork(1, "Little fork", false, true);
        array[2] = new Fork(1, "Little fork", false, true);
        array[3] = new Plate(2, "Plate", true, false);
        array[4] = new Spoon(10, "BIIIIG spoon", true, true);
        for (Dish di : array)
            di.wash();
        for (Dish di : array)
            di.repair();
    }
}
