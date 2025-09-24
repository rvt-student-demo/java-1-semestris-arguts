package rvt;

import java.util.Scanner;

public class delikateshu_veikals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi preci: ");
        String name = scanner.nextLine();
        System.out.print("Ievadi cenu: ");
        Double cena = Double.valueOf(scanner.nextLine());
        System.out.print("Ekspress piegade (0 == ne, 1 == ja): ");
        int ekspr = Integer.valueOf(scanner.nextLine());
        double piegadecen = 0;

        if(ekspr == 1){
        
            piegadecen += 3;
        }
        if (cena < 10) {
            
            piegadecen += 2;
        }

        System.out.println("\nRekins:");
        System.out.printf("\t" + name + " %.2f%n",cena);
        System.out.printf("\tpiegade %.2f%n",(piegadecen));
        System.out.printf("\tKopa %.2f%n",(cena + piegadecen));
        
 scanner.close();
    }
}
