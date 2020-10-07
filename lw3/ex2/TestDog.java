package lw3.ex2;

public class TestDog {
    public static void main(String[] args) {
        Dog[] arr = new Dog[4];
        arr[0] = new Corgi("Dogi", 15, true);
        arr[1] = new Husky("Wol", 1, false);
        arr[2] = new Bulldog("Cote", 10, true);
        arr[3] = new Corgi("Ee", 3, true);
        for (Dog d : arr)
            d.bark();
    }
}
