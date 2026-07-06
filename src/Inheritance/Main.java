package Inheritance;
class Animal{
    void Eat(){
        System.out.println("Animal is Eating");
    }

}
class Dog extends Animal{
    void Bark(){
        System.out.println("The Dog Is Barking");
    }
}
public class Main {
    public static void main(String[] args){
        Dog D=new Dog();
        D.Eat();
        D.Bark();
    }
}
