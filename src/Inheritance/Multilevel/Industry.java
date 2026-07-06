package Inheritance.Multilevel;
class Company {
    void company() {
        System.out.println("ABC Technologies");
    }
}

class Department extends Company {
    void department() {
        System.out.println("IT Department");
    }
}

class ITDepartment extends Department {
    void project() {
        System.out.println("Working on Java Project");
    }
}

class Developer extends ITDepartment {
    void coding() {
        System.out.println("Developer writes code");
    }
}

class SeniorDeveloper extends Developer {
    void review() {
        System.out.println("Senior Developer reviews code");
    }
}

public class Industry {
    public static void main (String[] args){
        SeniorDeveloper obj=new SeniorDeveloper();
        obj.company();
        obj.department();
        obj.project();
        obj.coding();
        obj.review();
    }

}

