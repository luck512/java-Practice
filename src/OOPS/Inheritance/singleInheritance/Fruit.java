package OOPS.Inheritance.singleInheritance;
class Taste{
    void Sweet(){
        System.out.println("It Is Sweet");
    }

}
class Colour extends Taste{
    void Yellow(){
        System.out.println("its Yellow Mango");
    }

}
public class Fruit {
    public static void main(String[] args){
        Colour C=new Colour();
        C.Sweet();
        C.Yellow();
    }
}
