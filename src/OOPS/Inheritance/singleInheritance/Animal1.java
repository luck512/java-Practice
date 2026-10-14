package OOPS.Inheritance.singleInheritance;
class Animals{
    void sound(){
        System.out.println("Animlas have Different sounds");
    }

}
class Doggy extends Animals{
    void bark(){
        System.out.println("Dog Barks");
    }

}
class Cat extends Animals{
    void meoww(){
        System.out.println("cat Meowws");
    }
}

public class Animal1 {
    public static void main(String[] args) {
        Doggy d =new Doggy();
        d.sound();
        d.bark();

        Cat c=new Cat();
        c.meoww();




    }



}
