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
            ResultDrunkard result = game.Solution(firstPlayer, secondPlayer);
            System.out.print(result.drunkardLog);
            if (result.steps < 106) {
                if (result.Win == 0)
                    System.out.print("Both be drunkards: ");
                else
                    System.out.print((result.Win > 0 ? "first" : "second") + " :");
                System.out.println(result.steps);
            } else
                System.out.println("botva");
        }
    }
}
