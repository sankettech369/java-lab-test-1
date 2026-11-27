import java.util.Scanner;

class exp10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main text: ");
        String text = sc.nextLine();

        System.out.print("Enter keyword: ");
        String key = sc.nextLine();

        int choice;

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

                case 1:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();

                    if (pos >= 0 && pos < text.length())
                        System.out.println("Character: " + text.charAt(pos));
                    else
                        System.out.println("Invalid position");
                    break;

                case 2:
                    int result = text.compareTo(key);

                    if (result == 0)
                        System.out.println("Both strings are equal");
                    else if (result < 0)
                        System.out.println("Text comes first alphabetically");
                    else
                        System.out.println("Keyword comes first alphabetically");
                    break;

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