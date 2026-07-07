package Inheritance.herichical;
class Family{
    void demo(){
        System.out.println("The Village has Too Many Families");
    }

}
class Father extends Family{
    void demo1(){
        System.out.println("The Faher Is Head Of The Family");
    }

}
class Mother extends Family{
    void Demo2(){
        System.out.println("Mother Is a SubHead Of The Family");
    }

}
class Child extends Family{
    void  demo3(){
        System.out.println("With Child All Together Becomes Family");

    }

}

public class Village {
    public static void main(String[] args){
        Father F=new Father();
        F.demo();
        F.demo1();

        Mother M=new Mother();
        M.demo();
        M.Demo2();

        Child C=new Child();
        C.demo();
        C.demo3();

    }
}
