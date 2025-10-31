package rvt;

public class statistics {
    private int count;
    private int sum;
    private double avg;

    public statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        count += 1;
        sum += number;
        avg = sum / (double)count ;
    }

    public int getCount() {
        
        return count;
    }
      public int sum() {
        return sum;
    }

    public double average() {
        return avg;
    }
}
