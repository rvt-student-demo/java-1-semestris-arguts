package rvt;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        
        sumOfNumbersInArray(numbers);
    }
    public static int sumOfNumbersInArray(int[] array){
        int suma = 0;
        for(int i = 0; i < array.length; i ++){
           suma += array[i];
        }
        System.out.println(suma);
        return suma;
    }
    
}
