package rvt;


public class advenced_astrology {

    public static void main(String[] args) {
        halfTriangle(4);
        System.out.println();
        xmansTree(6);
    }

    public static void printSpaces(int number) {
        System.out.print(" ".repeat(number));  
    }

    public static void printStars(int number) {
        System.out.print("*".repeat(number));  
        
    }

    public static void halfTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);   
            printStars(i);           
            System.out.println();   
        }
    }
    public static void xmansTree(int TreeSize){
        for(int i = 1; i <= TreeSize; i++){
            printSpaces(TreeSize - i);
            printStars(i + (i - 1));
            System.out.println();
        }
        for(int i = 0; i < 2; i++){
            printSpaces(((1 + (TreeSize  - 1) * 2) / 2) - 1);
            printStars(3);
            System.out.println();
        }

    }
}
