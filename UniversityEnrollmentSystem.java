// exp 3
import java.util.Scanner;

class Student{
        static int enrolledCount=0;
        final String name;
        final int m1,m2,m3;

        static{
                System.out.println("Welcome to University Enrollment System");
        }

        Student(String name, int m1, int m2, int m3){
                this.name=name;
                this.m1=m1;
                this.m2=m2;
                this.m3=m3;
                enrolledCount++;
        }

        static void displayTotalEnrolled(){
                System.out.println("Total Enrolled Students are " + enrolledCount);
        }

       void displayPerformance() {
                int min = Math.min(m1, Math.min(m2, m3));
                double bestTwoAvg = (m1 + m2 + m3 - min) / 2.0;

                System.out.printf("Student: %s | Marks: [%d, %d, %d] | Best 2 Avg: %.2f\n",
                      name, m1, m2, m3, bestTwoAvg);
}
}

public class UniversityEnrollmentSystem{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of students: ");
                int n = sc.nextInt();
                sc.nextLine();

                for (int i = 1; i <= n; i++) {

                        System.out.println("Enter details for student " + i);

                        System.out.print("Enter student name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter three test marks: ");

                        int m1 = sc.nextInt();
                        int m2 = sc.nextInt();
                        int m3 = sc.nextInt();

                        sc.nextLine();

                         // MODIFIED: Object created using user input
                         Student s = new Student(name, m1, m2, m3);

                        // YOUR ORIGINAL non-static method
                        s.displayPerformance();
        }
                Student.displayTotalEnrolled();

                sc.close();
        }
}