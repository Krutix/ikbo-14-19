package lw3.ex2;

public class Corgi extends Dog {
    Corgi(String newName, int newAge, boolean vaccinated) {
        super(newName, newAge, vaccinated);
    }

    @Override
    public void bark() {
        System.out.println("Wuf Wuf");
    }
}
