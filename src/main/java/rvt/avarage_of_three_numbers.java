package rvt;
import java.util.Scanner;

public class avarage_of_three_numbers{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of first number:");
        int firstnm = Integer.valueOf(scanner.nextLine());
        System.out.println("Value of second number:");
        int secnum = Integer.valueOf(scanner.nextLine());
        System.out.println("Value of third number:");
        int thirdnum = Integer.valueOf(scanner.nextLine());
        double avrager = (firstnm + secnum + thirdnum) / 3.0;
        System.out.println("The avarage is " + avrager);
scanner.close();

    }
      

}