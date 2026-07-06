package Inheritance;
class Color{
    void Red(){
        System.out.println("the car has red color");

    }
}
class Speed extends Color{
    void speed(){
        System.out.println("it is running 50kmh");
    }
}
public class Car {
    public static void main(String[] args) {
        Speed S=new Speed();
        S.Red();
        S.speed();
    }
}
