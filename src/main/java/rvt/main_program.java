package rvt;
import java.util.Scanner;

public class main_program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        statistics statistics = new statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Enter numbers: ");
        while(true){
            statistics.addNumber(Integer.valueOf(scanner.nextLine()));
            if( == -1){
                break;
            }

        }
    }
}
