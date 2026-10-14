package AccessModifiers.Public;
class Student {
    private int rollNo = 101;

    void display() {
        System.out.println("Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
