package lw2.ex1;

public class TestCircle {
    public static void main(String[] argv)
    {
        Circle test = new Circle(2, 2, 3, "Blue");
        System.out.println(test);
        test.setCentre(3, 5);
        System.out.println(test);
        test.setColor("Green");
        System.out.println(test);
    }
}
