package Thi;

public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new Bank(1000, 10);
        double interest = b1.getBalance();
        System.out.println("$: " + interest);
    }
}
