package rvt;

import java.util.Scanner;

public class Addition_formula {
    public static void main(String[] args) {
        Scanner sumer = new Scanner(System.in);
        System.out.println("Given the first number:");
        int firstsk = Integer.valueOf(sumer.nextLine());
        System.out.println("Given the second number:");
        int secondsk = Integer.valueOf(sumer.nextLine());
        int sum = firstsk + secondsk;
        System.out.println(firstsk + "+" + secondsk +"="+sum);
        
    }
   
}
