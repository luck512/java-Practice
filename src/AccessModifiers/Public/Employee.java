package AccessModifiers.Public;
class Emp{
   private int empid=544654;

   void show(){
       System.out.println("Emp Id is "+ empid);

   }
}

public class Employee {
    public static void main (String[] args){
        Emp E=new Emp();
        E.show();

    }
}
