package OOPS.Inheritance.Multilevel;

class Device{
    void powerOn(){
        System.out.println("Device Power On");
    }
}
class Computer extends Device{
    void process(){
        System.out.println("Computer is processing Data");
    }

}
class Laptops extends Computer{
    void portable(){
        System.out.println("laptops Are Portable");
    }

}
class GamingLaptop extends Laptops{
    void graphic(){
        System.out.println("gaming laptops has high Graphics");
    }

}
class AsusRog extends GamingLaptop{
    void brand(){
        System.out.println("AsusROG5");
    }

}

public class Laptop {
    public static void main (String[] args){
        AsusRog obj=new AsusRog();
        obj.powerOn();
        obj.process();
        obj.portable();
        obj.graphic();
        obj.brand();

    }
}
