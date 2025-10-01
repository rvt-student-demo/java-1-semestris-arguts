package rvt;

import java.util.Scanner;

public class chapter19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex1(scanner);

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
            for(int i = start; i > end -1; i--){
                System.out.println(i);
            }
            
        }
    }
    public static void ex2() {

    }
}
