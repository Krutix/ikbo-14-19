package lw9.ex6_8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKeys() {
        Scanner myScanner = new Scanner(System.in);
        while (myScanner.hasNextLine())
        {
            String key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}