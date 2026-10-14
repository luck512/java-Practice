package OOPS.Inheritance.singleInheritance;

class Parent{
    void aceres(){
        System.out.println("parent has 5 aceres");
    }
}
class Child extends Parent{
   void Makedmore(){
       System.out.println("chid makes it 7 aceres");
   }

}
public class SingleInheritance {
    public static void main(String[] args) {

        Child  C=new Child();
        C.aceres();
        C.Makedmore();
    }
}
