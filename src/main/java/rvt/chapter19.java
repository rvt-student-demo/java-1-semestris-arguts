package rvt;

import java.util.Scanner;

public class chapter19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex2(scanner);

    }

    public static void ex1(Scanner scanner) {
        System.out.println("Ievadi pirmo skaitli:");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadi pedejo skaitli:");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        if (start < end) {
            for (int i = start; i < end + 1; i++) {
                System.out.println(i);
            }
        }
        if (start > end) {
            for (int i = start; i > end - 1; i--) {
                System.out.println(i);
            }

        }
    }

    public static void ex2(Scanner scanner) {
        System.out.println("Enter N:");
        int n = Integer.valueOf(scanner.nextLine());
        double FunctionSum = ((n * (n + 1)) / 2);
        double LoopSum = 0;
        for (int i = 1; i < n + 1; i++) {
            LoopSum += i;
        }

        System.out.println("Loop Sum = " + LoopSum);
        System.out.println("Formula Sum = " + FunctionSum);
    }
}
