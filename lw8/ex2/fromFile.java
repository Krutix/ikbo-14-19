package lw8.ex2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fromFile {
    public static void main(String[] args) throws IOException {
        char[] buff = new char[100];
        int red;
        FileReader reader = new FileReader("ConsoleRead.txt");
        while ((red = reader.read(buff)) != 0)
        {
            System.out.print(buff);
        }
        reader.close();
    }
}
