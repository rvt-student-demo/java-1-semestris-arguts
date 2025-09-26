package rvt;

import java.util.Random;
import java.util.Scanner;

public class spele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int victor = 0;
        int result = random.nextInt(1, 11);
        System.out.println("Es domaju par skaitli no 1 lidz 10\nTev tas jauzmin tris meginajumos.\nIevadi minejumu:");

        for (int i = 0; i < 3; i++) {
            int skaitlo = Integer.valueOf(scanner.nextLine());
            if (skaitlo != result) {
                System.out.println("Nepareizi!");
            } else {
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarejis speli.");
                victor++;
                break;
            }

        }
        if (victor == 0) {
            System.out.println("Tu esi zaudejis speli.");
        }

    }

}
