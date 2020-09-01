package example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        ArgsOfTerminal(args);
        GarmonicalNumbers(10);

        int[] massive = new int[] {2, 3, 4, 1, 9};

        SumWithFor(massive);
        SumWithWhile(massive);
        SumWithDoWhile(massive);

        RandomArray();

        int factor;
        do {
            System.out.println("Enter factorial or enter 0 to exit");
            Scanner scanner = new Scanner(System.in);
            factor = scanner.nextInt();
            if(factor == 0)
                break;
            Factorial(factor);
        }
        while (true);
    }

    public static void ArgsOfTerminal(String[] args){
        for(String arg : args)
            System.out.println(arg);
    }

    public static void GarmonicalNumbers(int to){
        for(int num = 1; num < to; num++){
            System.out.println(1. / (double)num);
        }
    }

    public static void SumWithFor(int[] array){
        int sum = 0;
        for (int out : array)
            sum += out;
        System.out.println(sum);
    }

    public static void SumWithWhile(int[] array){
        int sum = 0;
        int idx = 0;
        while (idx < array.length)
            sum += array[idx++];
        System.out.println(sum);
    }

    public static void SumWithDoWhile(int[] array){
        int sum = 0;
        if (array.length != 0) {
            int idx = 0;
            do {
                sum += array[idx++];
            } while (idx < array.length);
        }
        System.out.println(sum);
    }

    public static void RandomArray()
    {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt() % 100;
        for (int i : array)
            System.out.print(i + ", ");
        Arrays.sort(array);
        System.out.println();
        for (int i : array)
            System.out.print(i + ", ");
        System.out.println();
    }

    public static void Factorial(int factorial){
        int result = factorial--;
        while (factorial != 0)
            result *= factorial--;
        System.out.println(result);
    }
}