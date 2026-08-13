package RoughPrograms;

class Student1{
    String name;
    int age;

    Student1(String name,int age){
        System.out.println(" " + name + " " +age);
        this.name=name;
        this.age=age;
    }

}

public class ThisKeyword {
    public static void main(String[] args) {
        Student1 Std=new Student1("laxman", 55);

    }
}
