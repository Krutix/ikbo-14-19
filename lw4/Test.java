package lw4;

public class Test {
    public static void main(String[] args) {
        Nameble[] arrNameble = new Nameble[3];
        arrNameble[0] = new Dog("Zilon", 2, true);
        arrNameble[1] = new Furniture("table", "Simmon", "Black", 1000);
        arrNameble[2] = new Dog("Korii", 2, true);
        for (Nameble n : arrNameble)
            System.out.println(n.getName());
        System.out.println();

        Priceable[] arrPriceable = new Priceable[3];
        arrPriceable[0] = new Dish("plate", false, false, 120);
        arrPriceable[1] = new Furniture("table", "Simmon", "Black", 1000);
        arrPriceable[2] = new Dish("fork", false, false, 50);
        for (Priceable n : arrPriceable)
            System.out.println(n.getPrice());
    }
}
