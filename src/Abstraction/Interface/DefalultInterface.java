package Abstraction.Interface;

interface Vehicle{
    private void StartEngine(){
        System.out.println("Engine Started");
    }
    default void Driver(){
        StartEngine();
        System.out.println("Driver Driving The car");
    }


}
class Car implements Vehicle{
//So upon This Method Executes The Above Methods
}

public class DefalultInterface {
    public static void main(String[] args){
        Car car=new Car();
        car.Driver();


    }
}
