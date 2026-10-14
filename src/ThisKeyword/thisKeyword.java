package ThisKeyword;
class Student
{
    int rollno;
    String name;

    Student(int rollno,String name)
    {
       this.rollno=rollno;
        this.name=name;

    }
    void show(){
        System.out.println("Roll No:" + rollno + "\nName:"+name);
    }
}
public class thisKeyword
{
    public static void main(String[] args)
    {
        Student obj=new Student(101," Rushi");
        obj.show();




    }

}
