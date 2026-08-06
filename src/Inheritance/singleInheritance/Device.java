package Inheritance.singleInheritance;
class Mobile{
    void Call(){
        System.out.println("Calling...");
    }

}
class Smartphone extends Mobile{
    void Internet(){
        System.out.println("Browsing Internet");
    }

}

public class Device {
    public static void main(String[] args){
        Smartphone S=new Smartphone();
        S.Call();
        S.Internet();
    }

}
