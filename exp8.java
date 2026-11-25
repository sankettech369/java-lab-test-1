
import java.util.Scanner;

// User-defined exception for older candidates
class TooOlder extends Exception {
    TooOlder(String msg) {
        super(msg);
    }
}

// User-defined exception for younger candidates
class TooYounger extends Exception {
    TooYounger(String msg) {
        super(msg);
    }
}

class exp8 {

    // Method to validate age eligibility
    static void validateAge(String name, int age)
            throws TooOlder, TooYounger {

        if (age > 45) {
            throw new TooOlder("Candidate is too old for recruitment.");
        }
        else if (age < 18) {
            throw new TooYounger("Candidate is too young for recruitment.");
        }
        else {
            System.out.println("Eligible");
            System.out.println("Candidate Name: " + name);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = sc.nextLine();

        System.out.print("Enter candidate age: ");
        int age = sc.nextInt();

        try {
            validateAge(name, age);
        }
        catch (TooOlder e) {
            System.out.println(e.getMessage());
        }
        catch (TooYounger e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
