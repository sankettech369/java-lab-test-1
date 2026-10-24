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

        void displayPerformance(){
                int min = (m1 < m2) ? ((m1 < m3) ? m1 : m3) : ((m2 < m3) ? m2 : m3);
                double bestTwoAvg = (m1 + m2 + m3 - min) / 2.0;

                System.out.printf("Student: %s | Marks: [%d, %d, %d] | Best 2 Avg: %.2f\n", name, m1, m2, m3, bestTwoAvg);
        }
}

public class UniversityEnrollmentSystem{
        public static void main(String[] args){
                Student s1 = new Student("Rahul", 80, 90, 39);
                Student s2 = new Student("Kunal", 88, 92, 59);
                Student s3 = new Student("Amul", 90, 50, 70);
                s1.displayPerformance();
                s2.displayPerformance();
                s3.displayPerformance();
                Student.displayTotalEnrolled();
        }
}