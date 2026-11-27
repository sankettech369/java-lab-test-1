import java.util.*;

class exp11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> students = new HashSet<>();
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    if (students.add(name))
                        System.out.println("Student added.");
                    else
                        System.out.println("Duplicate name not allowed.");
                    break;

                case 2:
                    System.out.println("Student Names:");

                    Iterator<String> it = students.iterator();

                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter name to remove: ");
                    name = sc.nextLine();

                    if (students.remove(name))
                        System.out.println("Student removed.");
                    else
                        System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}