package rvt;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = { 1, 3, 5, 7, 9 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("\nGive two indicates to swap:");
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int vert1 = numbers[num1];
        int vert2 = numbers[num2];

        numbers[num1] = vert2;
        numbers[num2] = vert1;
        
        System.out.println("");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
