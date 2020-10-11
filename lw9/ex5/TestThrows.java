package lw9.ex5;

public class TestThrows {
    public static void main(String[] args) {
        ThrowsDemo test = new ThrowsDemo();
        test.getDetails("null");
        test.getDetails(null);
    }
}
