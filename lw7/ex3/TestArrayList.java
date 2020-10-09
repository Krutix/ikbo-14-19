package lw7.ex3;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList_<String> arr = new ArrayList_<String>();
        arr.add("German");
        arr.add("France");
        arr.add("Japan");
        for (int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));
        System.out.println();
        arr.add("English");
        for (int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));
        System.out.println();
        arr.set(1, "Denmark");
        arr.set(0, "Poland");
        for (int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));
    }
}
