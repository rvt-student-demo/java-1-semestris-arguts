package rvt;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dividing_checker(scanner.nextInt() , scanner.nextInt());
    }
    public static void dividing_checker(int start, int end){
        for(int i = start; i < end + 1; i++){

            if(i % 3 == 0){
                System.out.println(i);
                continue;
            }

        }
    }

}
