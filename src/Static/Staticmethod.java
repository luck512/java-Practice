package Static;

public class Staticmethod {
    void m1(){
        System.out.println("M1 Method Executed");

    }
    static void m2(){
        System.out.println("M2 Method Executed");

    }
    public static void main(String[] args){
        Staticmethod S=new Staticmethod();
        S.m1();
        Staticmethod.m2();


    }
}
