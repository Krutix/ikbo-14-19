package pr7;

import pr7.ex1.DrunkardGameStack;
import pr7.ex2.DrunkardGameQueue;
import pr7.ex3.DrunkardGameDequeue;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ConsoleInput {
    static Scanner scanner = new Scanner(System.in);

    private static int[] toIntArray(String[] array)
    {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = Integer.parseInt(array[i]);
        return result;
    }

    public static void main(String[] args) {
        IDrunkardGame game = new DrunkardGameQueue();
        Pattern split = Pattern.compile(" ");
        while (true) {
            System.out.println("Enter datastore: 1) Stack; 2) Queue; 3) Deque");
            int datastore = Integer.parseInt(scanner.nextLine());
            switch (datastore)
            {
                case 1:
                    game = new DrunkardGameStack();
                    break;
                case 2:
                    game = new DrunkardGameQueue();
                    break;
                case 3:
                    game = new DrunkardGameDequeue();
                    break;
            }
            int[] firstPlayer = toIntArray(split.split(scanner.nextLine()));
            int[] secondPlayer = toIntArray(split.split(scanner.nextLine()));
            int[] result = game.Solution(firstPlayer, secondPlayer);
            if (result[1] < 106) {
                System.out.print((result[0] < 0 ? "first" : "second") + " ");
                System.out.println(result[1]);
            } else
                System.out.println("botva");
        }
    }
}
