package Classes;

public class Student {
        int studentage;
        String studentname;

        public static void main(String[] args) {
            Student obj1=new Student();
            obj1.studentage=21;
            obj1.studentname="LAXMAN";
            System.out.println(obj1.studentname);
            System.out.println(obj1.studentage);

            Student obj2= new Student();
            obj2.studentage=23;
            obj2.studentname="HARSHAL";
            System.out.println(obj2.studentname);
            System.out.println(obj2.studentage);

            Student obj3=new Student();
            obj3.studentage=10;
            obj3.studentname="rakesh";
            System.out.println(obj3.studentname);
            System.out.println(obj3.studentage);
        }
    }

