package rvt;
import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Given a number:");
        int numberuno = Integer.valueOf(scanner.nextLine());
        if (numberuno % 2 == 0){
            System.out.println("Number " + numberuno + " is even");
        }else{
            System.out.println("Number " + numberuno + " Is odd");
        }



    }

}