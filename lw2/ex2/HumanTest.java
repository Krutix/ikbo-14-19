package lw2.ex2;

class HumanTest {
    public static void main(String[] argv)
    {
        Human test = new Human(new Hand(5, false, "Black"),
                new Leg(6, "Black", true), new Head(0, "Black", "Black"));
        System.out.println(test);
        test.getRightHand().setWasShot(true);
        test.getHead().setHairColor("Pink");
        test.getHead().setEyesColor("Pink");
        System.out.println(test);
    }
}