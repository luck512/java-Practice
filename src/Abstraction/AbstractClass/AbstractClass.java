package Abstraction.AbstractClass;
abstract class Veichel{
     abstract void start();

}

class Scooter extends Veichel{
    void start(){
        System.out.println("Starts With Kick");
    }

}
class Car extends Veichel{
    void start(){
        System.out.println("Start with key");
    }
}


public class AbstractClass {
    public static void main(String[] args){
        Veichel obj=new Scooter();
        obj.start();


    }
}
