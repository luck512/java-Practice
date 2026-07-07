package Inheritance.herichical;
class Fruit {
    void taste() {
        System.out.println("Fruit is tasty");
    }
}

class Mango extends Fruit {
    void color() {
        System.out.println("Mango is Yellow");
    }
}

class Apple extends Fruit {
    void type() {
        System.out.println("Apple is Red");
    }
}

public class Fruits {
    public static void main(String[] args) {
        Mango m = new Mango();
        m.taste();
        m.color();

        Apple a = new Apple();
        a.taste();
        a.type();
    }
}
