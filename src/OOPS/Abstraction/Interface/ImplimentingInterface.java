package OOPS.Abstraction.Interface;
interface A{
   void method1();
   void method2();


}
interface B extends A{
    void method3();

}

public class ImplimentingInterface implements B {

    public void method1(){
        System.out.println("This Is Method 1");
    }
    public void method2(){
        System.out.println("This Is Method 2");
    }
    public void method3(){
        System.out.println("This Is Method 3");
    }
    public static void main(String[] args){

        ImplimentingInterface I=new ImplimentingInterface();
        I.method1();
        I.method2();
        I.method3();
    }

}
