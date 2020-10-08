package lw8.ex4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class appendToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("ConsoleRead.txt", true);
        Scanner scanner = new Scanner(System.in);
        String str;
        while (scanner.hasNext())
        {
            str = scanner.nextLine();
            writer.write(str + '\n');
        }
        writer.close();
    }
}
