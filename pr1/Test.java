package pr1;

public class Test {
    public static void main(String[] args){
        Ball standardBall = new Ball();
        Ball redBigBall = new Ball();
        redBigBall.setRadius(5.);
        redBigBall.setColor("Red");
        Ball yellowBall = new Ball(2.,"Yellow", 1.f);

        System.out.println(standardBall.toString());
        System.out.println(redBigBall.toString());
        System.out.println(yellowBall.toString());

        Book standardBook = new Book();
        Book doomBook = new Book();
        doomBook.setAuthor("Devid Kushner");
        doomBook.setName("Masters of Doom");
        doomBook.setNumberOfPages(352);
        Book oopPatterns = new Book("Design Patterns", "GoF", 431);

        System.out.println(standardBook.toString());
        System.out.println(doomBook.toString());
        System.out.println(oopPatterns.toString());

        Dog standardDog = new Dog();
        Dog secDog = new Dog();
        secDog.setName("Woofer");
        secDog.isVaccinated = true;
        secDog.setAge(2);
        Dog vemDog = new Dog("Rax", 12);

        System.out.println(standardDog);
        System.out.println(secDog);
        System.out.println(vemDog);
    }
}
