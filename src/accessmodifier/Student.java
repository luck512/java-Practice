package accessmodifier;
class Class1{
    void show(){
        System.out.println("hello");
    }
}

public class Student {
    public static void main(String[] args) {
        Class1 c=new Class1();
        c.show();


    }
}
