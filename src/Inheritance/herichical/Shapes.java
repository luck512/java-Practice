package Inheritance.herichical;
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void circleArea() {
        System.out.println("Area of Circle");
    }
}

class Rectangle extends Shape {
    void rectangleArea() {
        System.out.println("Area of Rectangle");
    }
}


public class Shapes {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.circleArea();

        Rectangle r = new Rectangle();
        r.draw();
        r.rectangleArea();
    }
}
