package lw8.ex1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class toFile {
    public static void main(String[] args) throws IOException {
        char[] buff = new char[1024];
        int red;
        FileReader reader = new FileReader("ConsoleRead.txt");
        while ((red = reader.read(buff)) != 0 && red != -1)
            for (int i = 0; i < red; i++)
                System.out.print(buff[i]);
        reader.close();
    }
}
