package ThisKeyword;

public class CurrentObjectInstanceVariable {
    int rollno;
    String name;
    void display(){
        System.out.println(this.rollno);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        CurrentObjectInstanceVariable obj=new CurrentObjectInstanceVariable();
        obj.name="Rahul";
        obj.rollno=101;

        obj.display();

    }
}
