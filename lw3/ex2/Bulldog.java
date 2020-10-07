package lw3.ex2;

public class Bulldog extends Dog{
    Bulldog(String newName, int newAge, boolean vaccinated) {
        super(newName, newAge, vaccinated);
    }

    @Override
    public void bark() {
        System.out.println("Wufpfpfpf");
    }
}
