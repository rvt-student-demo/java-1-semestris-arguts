package rvt;

public class Counter_trying {
    public static void main(String[] args) {
        Counter c = new Counter(5);
        System.out.println(c.value());
        c.decrease();
        System.out.println(c.value());
        c.increase(5);
        System.out.println(c.value());
        c.decrease(6);
        System.out.println(c.value());
    }
}
