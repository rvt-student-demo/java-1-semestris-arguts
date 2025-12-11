package rvt;

public class chapter50 {
    public static void main(String[] args) {
        {
            box small = new box(2, 3, 4);
            box big   = new box(5, 6, 7);
    
            System.out.println(small.nests(big));   
            System.out.println(big.nests(small));   
        }
}
}