package rvt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class ArrayListList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnlyTheseNumbs(scanner);
    }
    public static void OnlyTheseNumbs(Scanner scanner){
        List<Integer> listy = new ArrayList<>();
        while(true){
            int numba = Integer.valueOf(scanner.nextLine());
            if(numba == -1){
                break;
            }
            listy.add(numba);
        }
        System.out.print("From where? ");
        int from = Integer.valueOf((scanner.nextLine()));
        System.out.print("To where? ");
        int to = Integer.valueOf(scanner.nextLine());

        for(int i = from; i < to + 1; i ++){
            System.out.println(listy.get(i));
        }
    }
}
