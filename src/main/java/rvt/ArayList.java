package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arr.add(i+ 1);
        }
        
        System.out.println(arr);
        if(arr.contains(6)){
            System.out.println("List holds value 6");
        };
        
    }
}
