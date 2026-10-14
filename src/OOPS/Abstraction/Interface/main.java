package OOPS.Abstraction.Interface;
interface Parent1{
    void m1();

}
interface Parent2{
    void m1();

}
class Child implements Parent1,Parent2{
    public void m1(){
        System.out.println("m1() Method Executed");
    }

}

public class main {
    public static void main(String[] args) {
        Child C= new Child();
        C.m1();

    }
}
