package lw8.ex2;

import java.io.FileReader;
import java.io.IOException;

public class fromFile {
    public static void main(String[] args) throws IOException {
        char[] buff = new char[1024];
        int red;
        FileReader reader = new FileReader("ConsoleRead.txt");
        while ((red = reader.read(buff)) != 0 && red != -1)
        {
            System.out.print(buff);
        }
        reader.close();
    }
}
