package lw3.ex2;

public class Husky extends Dog {
    Husky(String newName, int newAge, boolean vaccinated) {
        super(newName, newAge, vaccinated);
    }

    @Override
    public void bark() {
        System.out.println("Wuuuuuf");
    }
}
