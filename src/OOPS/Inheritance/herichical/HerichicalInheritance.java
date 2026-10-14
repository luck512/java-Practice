package OOPS.Inheritance.herichical;
class GGP{
    void AnotherDemo(){
        System.out.println("this is method no 1");
    }

}
class GP extends GGP{
    void demo(){
        System.out.println("hello");
    }

}
class PP extends GGP{
    void gp(){
        System.out.println("hii");
    }

}
class CC extends GGP{

}

public class HerichicalInheritance {
    public static void main (String[] args){
        CC obj=new CC();
        obj.AnotherDemo();

        GP obj1 =new GP();
        obj1.demo();
        obj1.AnotherDemo();

    }
}
