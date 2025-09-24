package rvt;
import java.util.Scanner;

public class Detalas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skruvju skaits: ");
        int skruves = Integer.valueOf(scanner.nextLine());
        System.out.print("Uzgrieznu skaits: ");
        int uzgriezni = Integer.valueOf(scanner.nextLine());
        System.out.print("Paplaksnu skaits: ");
        int paplaksnes = Integer.valueOf(scanner.nextLine());

        if(skruves == uzgriezni && paplaksnes == (skruves * 2)){
            System.out.println("\nPasutijums ir kartiba.");
        }else if(uzgriezni < skruves && paplaksnes < (skruves * 2)){
            System.out.println("\nParbaudi pasūtījumu: par maz uzgrieznu.");
            System.out.println("Parbaudi pasūtījumu: par maz paplaksnu.");
        }else if(uzgriezni < skruves){
            System.out.println("\nParbaudi pasutijumu: par maz uzgrieznu.");
        }else if(paplaksnes < (skruves * 2)){
            System.out.println("\nParbaudi pasutijumu: par maz paplaksnu.");
        }
        System.out.println("\nKopeja cena: " + (skruves * 5 + uzgriezni * 3 + paplaksnes));
        scanner.close();
    }
}
