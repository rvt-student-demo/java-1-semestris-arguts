package rvt;

public class chapter60 {
    public static void main(String[] args) {
        ex5(args);
    }

    public static void ex1(String[] args) {
        int[] numbers = { 0, 5, 5, 5 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    public static void ex2(String[] args) {
        int[] val = { 13, -4, 82, 17 };
        int[] twice = val;

        System.out.println("Original Array: ");
        for(int i = 0; i < val.length; i++){
            System.out.println(val[i]);
        }
        // Construct an array object for twice.

        // Put values in twice that are twice the
        // corresponding values in val.
        System.out.println("Twice Array: ");
        for(int i = 0; i < twice.length; i++){
            System.out.println(twice[i] * 2);
        }
        
    }
    public static void ex5(String[] args) {
   int[] val = {12, 9, 2, 95, 29}; 
    int temp;
 
    System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] + " " + val[4] );
 
    // reverse the order of the numbers in the array
    for(int i = 0; i < val.length / 2; i++){
        temp = val[i];
        val[i] = val[val.length - 1 - i];
        val[val.length -1 - i] = temp;
    }

    System.out.println( "Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] + " " + val[4] );
    }
}
