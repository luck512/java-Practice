package Static;
class Employee{
    String name;
    static String Company="accenture";
    static int empcount=0;
    Employee(String name){
        this.name=name;
        empcount++;

    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee E=new Employee("Amit");
        Employee E2=new Employee("Chandrakant");

        System.out.println(E.name +" Work At:"+ Employee.Company );
        System.out.println(E2.name +" Work At:"+ Employee.Company);
        System.out.println("EmployeeCount: "+Employee.empcount);


    }
}
