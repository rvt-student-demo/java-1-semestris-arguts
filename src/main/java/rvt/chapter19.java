package rvt;

import java.util.Scanner;

public class chapter19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex4(scanner);

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

    public static void ex3(Scanner scanner) {
        System.out.println("Enter N:");
        int n = Integer.valueOf(scanner.nextLine());
        double FunctionSum = ((n * (n + 1) * (2 * n + 1)) / 6);
        double LoopSum = 0;
        for (int i = 1; i < n + 1; i++) {
            LoopSum += i * i;
        }

        System.out.println("Loop Sum = " + LoopSum);
        System.out.println("Formula Sum = " + FunctionSum);

    }

    public static void ex4(Scanner scanner) {
        System.out.println("Enter low");
        int low = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter high");
        int high = Integer.valueOf(scanner.nextLine());
        int low_rez = ((low*(low-1))/2);
        int high_rez = ((high*(high+1))/2);

        int rez = high_rez - low_rez;

        System.out.println(rez);
    //     for(int i = low; i < high ; i++){

    // }

    }

}
