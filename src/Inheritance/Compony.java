package Inheritance;
class Empolyee{
    void Work(){
        System.out.println("Employee is Working");
    }

}
class Manager extends Empolyee{
    void Manage(){
        System.out.println("Manager Manages The Team");
    }

}
public class Compony {
    public static void main(String[] args){
        Manager M=new Manager();
        M.Work();
        M.Manage();

    }
}
