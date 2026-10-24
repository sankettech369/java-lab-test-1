package services;


public class interest {
    public double calculateInterest(double balance) {
        double rate = 5.0;
        return balance + (balance * rate / 100);
    }
}
