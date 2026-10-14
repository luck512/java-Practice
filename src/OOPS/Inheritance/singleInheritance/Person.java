package OOPS.Inheritance.singleInheritance;

class Teacher{
    void TeacherName(){
        System.out.println("Teacher Name Is Laxman");
    }

    }
class Student extends Teacher {
    void StudentName() {
        System.out.println("Student Name Is Akshay");

    }
}

    public class Person {
        public static void main(String[] args) {
            Student S= new Student();
            S.TeacherName();
            S.StudentName();

        }
    }

