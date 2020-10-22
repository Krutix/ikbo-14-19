package pr9.INN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<Integer, String> users = new HashMap<Integer, String>();

    private static void createHashMap() {
        users.put(111000, "Egor");
        users.put(111001, "Igor");
        users.put(111069, "Kiril");
        users.put(100009, "Denis");
    }

    public static void main(String[] args) {
        createHashMap();
        while (scanner.hasNext()) {
            String name = scanner.next();
            int INN = scanner.nextInt();
            try {
                if (validateINN(name, INN))
                    System.out.println("TRUE");
                else
                    System.out.println(name + "'s INN is invalid");
            }
            catch (BadINNException e) {
                System.out.println(e.toString());
            }
        }
    }

    public static boolean validateINN(String name, int INN) throws BadINNException {
        if (!users.containsKey(INN))
            throw new BadINNException("INN from user '" + name + "' is invalid");
        if (users.get(INN).compareTo(name) == 0)
            return true;
        return false;
    }
}
