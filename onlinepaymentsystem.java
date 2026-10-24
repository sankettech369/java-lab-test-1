// exp 5
import java.util.Scanner;
class payment{
    double amount;

    payment(double amount){
        this.amount=amount;
    }
    void processpayment(){
        System.out.println("processing payment...");
    }
}
class creditcardpayment extends payment{
    creditcardpayment(double amount){
        super(amount);
    }
    void processpayment(){
        double total=amount+(amount*0.02);
        System.out.printf("credit card final amount: Rs. %2f%n", total);
    }
}

class upipayment extends payment{
    upipayment(double amount){
        super(amount);
    }
    void processpayment(){
        double total=amount+5;
        System.out.printf("upi final amount: Rs . %2f%n",total);
    }
}

class netbankingpayment extends payment{
    netbankingpayment(double amount){
        super(amount);
    }
    void processpayment(){
        double total=amount+(amount*0.015);
    System.out.printf("netbanking final amount: Rs. %2f%n",total);
}
}

public class onlinepaymentsystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter payment amount:");
        double amount=sc.nextDouble();
        System.out.println("Choose Payment Method:");
        System.out.println("1. credit card");
        System.out.println("2. upi");
        System.out.println("3. netbanking");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();

        payment p;
        switch(choice){
            case 1:
                p= new creditcardpayment(amount);
                break;

            case 2:
                p= new upipayment(amount);
                break;

            case 3:
                p= new netbankingpayment(amount);
                break;

            default:
                System.out.println("Invalid payment method!");
                sc.close();
                return;

        }
        p.processpayment();
        sc.close();
    }
    
    
}




















