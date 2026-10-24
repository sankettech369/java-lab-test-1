import accounts.account;
import services.interest;

public class bankdemo {
    public static void main(String[] args) {
        account a = new account(101, "Rahul", 10000);
        a.displayDetails();

        a.deposit(2000);
        a.withdraw(1000);

        interest i = new interest();
        double updatedBalance = i.calculateInterest(11000);

        System.out.printf("Balance after interest: Rs. %.2f%n",
                          updatedBalance);
    }
}
