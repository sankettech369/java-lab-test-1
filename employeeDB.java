// exp 1
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
       employee[] e={
new employee("rahul",101,"sales",25,"executive",30000),
new employee("priya",102,"sales",28,"manager",45000),
new employee("amit",103,"purchase",35,"manager",60000),
new employee("neha",104,"purchase",29,"manager",55000),
new employee("kiran",105,"sales",26,"executive",35000)};
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

       System.out.println("highest paid purchase manager:");
       max.display();
       }
}