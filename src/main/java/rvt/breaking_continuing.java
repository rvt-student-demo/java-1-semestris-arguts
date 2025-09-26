package rvt;

import java.util.Scanner;

public class breaking_continuing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gvie numbers:");
        int suma = 0;
        int sumofnuma = 0;
        double avgn = 0;
        int odd = 0;
        int even = 0;
        while (true) {
            int numba = Integer.valueOf(scanner.nextLine());
            if (numba == -1) {
                break;
            }
            if (numba % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            suma += numba;
            sumofnuma++;

        }
        avgn = (double) suma / (double) sumofnuma;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + suma);
        System.out.println("Numbers: " + sumofnuma);
        System.out.println("Average: " + avgn);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        scanner.close();
    }
}
