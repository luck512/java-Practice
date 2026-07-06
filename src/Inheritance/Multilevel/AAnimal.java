package Inheritance.Multilevel;
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

class BabyDog extends Puppy {
    void sleep() {
        System.out.println("Baby dog sleeps");
    }
}

public class AAnimal {
    public static void main(String[] args){
        BabyDog obj = new BabyDog();
        obj.eat();
        obj.walk();
        obj.bark();
        obj.play();
        obj.sleep();
    }
}
