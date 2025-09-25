package rvt;

import java.util.Scanner;

public class numbersum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int skskaits = 0;
        while (true) {
            System.out.println("Give a number: ");
            int numba = Integer.valueOf(scanner.nextLine());
            if (numba == 0) {
                break;
            }
            skskaits++;
            suma += numba;

        }
        System.out.println("Number of numbers: " + skskaits);
        System.out.println("Sum of the numbers: " + suma);
        scanner.close();
    }

}
