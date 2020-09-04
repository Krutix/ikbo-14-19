package UML;

public class Test {
    public static void main(String[] args){
        Author a = new Author("John", "jojotheworld@gmail.com", 'm');
        System.out.println(a);

        Ball b = new Ball(1., 2.);
        b.move(2., -1.);
        System.out.println(b);
    }
}