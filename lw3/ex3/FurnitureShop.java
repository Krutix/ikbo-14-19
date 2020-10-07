package lw3.ex3;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture[] shop = new Furniture[7];
        shop[0] = new Chair("Elephant", "Blue", 2.f, 1.f, 1.f, 100);
        shop[1] = new Chair("Elephant", "Yellow", 2.f, 1.f, 1.f, 100);
        shop[2] = new Table("Dog", "Black", 1.3f, 2.f, 4.f, 200);
        shop[3] = new Table("Dog", "White", 1.3f, 2.f, 4.f, 200);
        shop[4] = new Cupboard("Enigma", "White", 2.3f, 2.f, 4.f, 1000);
        shop[5] = new Cupboard("Enigma", "Black", 2.3f, 2.f, 4.f, 1000);
        shop[6] = new Cupboard("Enigma", "Blue", 2.3f, 2.f, 4.f, 1000);

        while(true)
        {
            for (int i = 0; i < shop.length; i++)
                System.out.println(i + ":\t\t"  + shop[i].toString());
            System.out.print("Enter id to buy: ");
            Scanner scanner = new Scanner(System.in);
            int id_buy = scanner.nextInt();
            if (id_buy < shop.length && id_buy >= 0)
                shop[id_buy].buy();
            else
                System.out.println("Enter invalid id(");
        }
    }
}
