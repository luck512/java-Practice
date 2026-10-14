package OOPS.Inheritance.herichical;

class Teacher{
    void Teaching(){
        System.out.println("Teacher is Teaching Coding");
    }

}
class Student1 extends Teacher{
    void Listning(){
        System.out.println("He is not Listining Carefully");
    }

}
class Student2 extends Teacher{
    void She(){
        System.out.println("she is listning Carefully");
    }

}

public class Class {
    public static void main(String[] args){
        Student1 stu=new Student1();
        stu.Teaching();
        stu.Listning();

        Student2 stu2=new Student2();
        stu2.Teaching();
        stu2.She();
    }
}
