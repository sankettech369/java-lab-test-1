
import java.util.Scanner;

public class exp10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept main text and keyword from user
        String text, key;

        System.out.print("Enter main text: ");
        text = sc.nextLine();

        System.out.print("Enter keyword: ");
        key = sc.nextLine();

        int choice;

        // Repeat menu until user chooses Exit
        do {
            System.out.println("\n--- TEXT PROCESSING MENU ---");
            System.out.println("1. Display character at position");
            System.out.println("2. Compare text and keyword");
            System.out.println("3. Search and replace keyword");
            System.out.println("4. Extract portion of text");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // QUESTION 1: View character at chosen position
                // charAt() returns the character at the given index
                case 1:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();

                    if (pos >= 0 && pos < text.length())
                        System.out.println("Character: " + text.charAt(pos));
                    else
                        System.out.println("Invalid position");
                    break;

                // QUESTION 2: Compare main text and keyword
                // compareTo() compares two strings alphabetically
                case 2:
                    int result = text.compareTo(key);

                    if (result == 0)
                        System.out.println("Both strings are equal");
                    else if (result < 0)
                        System.out.println("Text comes first alphabetically");
                    else
                        System.out.println("Keyword comes first alphabetically");
                    break;

                // QUESTION 3: Search and replace keyword
                // indexOf() finds the first occurrence of keyword
                // replace() replaces all occurrences of keyword
                case 3:
                    int index = text.indexOf(key);

                    if (index != -1) {
                        System.out.println("First occurrence: " + index);

                        System.out.print("Enter replacement word: ");
                        String word = sc.nextLine();

                        text = text.replace(key, word);
                        System.out.println("Updated text: " + text);
                    } else {
                        System.out.println("Keyword not found");
                    }
                    break;

                // QUESTION 4: Extract a portion of text
                // substring() extracts characters between start and end
                case 4:
                    System.out.print("Enter start position: ");
                    int start = sc.nextInt();

                    System.out.print("Enter end position: ");
                    int end = sc.nextInt();

                    if (start >= 0 && end <= text.length() && start < end)
                        System.out.println("Extracted text: " +
                                           text.substring(start, end));
                    else
                        System.out.println("Invalid positions");
                    break;

                // QUESTION 5: Exit the program
                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
