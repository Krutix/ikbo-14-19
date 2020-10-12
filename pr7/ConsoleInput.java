package pr7;

import pr7.ex1.DrunkardGameStack;
import pr7.ex2.DrunkardGameQueue;
import pr7.ex3.DrunkardGameDequeue;

public class ConsoleInput {
    public static void main(String[] args) {
        IDrunkardGame game = new DrunkardGameStack();
        int[] result = game.Solution(new int[]{3, 1, 5, 7, 9}, new int[]{2, 4, 6, 8, 0});
        if (result[1] < 106)
        {
            System.out.print((result[0] < 0 ? "first" : "second") + " ");
            System.out.println(result[1]);
        }
        else
            System.out.println("botva");
    }
}
