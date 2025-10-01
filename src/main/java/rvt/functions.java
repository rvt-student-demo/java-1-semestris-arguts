package rvt;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dividing_checker(scanner.nextInt() , scanner.nextInt());
    }
    public static void dividing_checker(int start, int end){
        for(int i = start; i < end; i++){

            if(i % 3 == 0){
                System.out.println(i + " Dalaas ar 3");
                continue;
            }
            if (i == 0) {
                System.out.println("\u001B[2A\u001B[1J");
                System.out.flush();
            }
        }
    }

}
