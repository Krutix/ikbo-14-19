package lw8.ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class toFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("ConsoleRead.txt");
        Scanner scanner = new Scanner(System.in);
        String str;
        while (scanner.hasNext())
        {
            str = scanner.nextLine();
            System.out.println(str);
            writer.write(str + '\n');
        }
        writer.close();
    }
}
