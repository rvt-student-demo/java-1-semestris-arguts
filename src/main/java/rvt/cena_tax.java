package rvt;
import java.util.Scanner;

public class cena_tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Walue of gif?");
        double cena = Double.valueOf(scanner.nextLine());
        if(cena < 5000){
            System.out.println("No tax!");
        } else if(cena >= 5000 && cena <= 25000){
            System.out.println("$" + (100+(cena - 5000) * 0.08));
        }  else if (cena > 25000 && cena <= 55000) {
            System.out.print("$" + (1700 + (cena - 25000) * 0.10));
        }
        else if (cena > 55000 && cena <= 200000) {
            System.out.print("$" + (4700 + (cena - 55000) * 0.12));
        }
        else if (cena > 200000 && cena <= 1000000) {
            System.out.print("$" + (22100 + (cena - 200000) * 0.15));
        }
        else if (cena > 1000000) {
            System.out.print("$" + (142100 + (cena - 1000000) * 0.17));
        }



        scanner.close();


    }
}
