package OOPS.Inheritance.Multilevel;
class GrandParent{
    void Grand(){
        System.out.println("The has 5 aceres");
    }

}
class Parent extends GrandParent{
    void First(){
        System.out.println("They make it 7 aceres");
    }

}
class Child extends Parent{
    void Second(){
        System.out.println("This one got 7 aceres");
    }

}
public class Grandchild {
    public static void main (String[] args){
        Child C=new Child();
        C.Grand();
        C.First();
        C.Second();
    }
}
