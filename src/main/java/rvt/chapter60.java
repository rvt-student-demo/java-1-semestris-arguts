package rvt;

public class chapter60 {
    public static void main(String[] args) {
        ex1(args);
    }
    public static void ex1(String[] args){
        int[] numbers = {0, 5, 5, 5};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
