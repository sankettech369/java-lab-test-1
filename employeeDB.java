// exp 1
import java.util.Scanner; 

class employee{
        String name;
        int emp_id,age;
        String department,designation;
        double salary;

        employee(String n,int id, String d, int a, String des, double s){
                name = n;
                emp_id = id;
                department = d;
                age=a;
                designation=des;
                salary = s;
        }
        void display(){
                System.out.println(name+" "+emp_id+" "+department+" "+age+" "+designation+" "+salary);
        }
}

public class employeeDB{
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       employee[] e=new employee[5];

       for(int i=0; i<5;i++){
        System.out.println("Enter details of employee " + (i + 1));

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Employee ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Department: ");
        String dept = sc.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Designation: ");
        String des = sc.nextLine();

        System.out.print("Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        e[i] = new employee(name, id, dept, age, des, salary);

       }



       for (employee x:e)
               x.display();

       double total=0;

       for(employee x:e)
               if(x.department.equals("sales"))
                       total +=x.salary;
       System.out.println("sales salary="+total);

       employee max=null;

       for(employee x:e)
               if(x.department.equals("purchase")&&x.designation.equals("manager")&&(max==null || x.salary>max.salary))
                       max=x;
        
       if(max!=null){
        System.out.println("highest paid purchase manager:");
        max.display();
       }else{
        System.out.println("no purchase manager found");
       }
       sc.close();
}
}