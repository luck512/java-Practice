package OOPS.Inheritance.singleInheritance;
class Animal{
    void Eat(){
        System.out.println("Animal1 is Eating");
    }

}
class Dog extends Animal1 {
    void Bark(){
        System.out.println("The Dog Is Barking");
    }
}
public class Main {
    public static void main(String[] args){
        Dog D=new Dog();

        D.Bark();
    }
}
