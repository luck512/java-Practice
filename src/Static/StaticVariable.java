package Static;

public class StaticVariable {
    String name;
    int rollno;
    static String SchoolName;

    static{
        SchoolName="Deogiri College";
    }

    StaticVariable(String name,int rollno){
        this.name=name;
        this.rollno=rollno;


    }
    void ShowDetails(){
        System.out.println("Name :"+ name);
        System.out.println("Roll No:"+ rollno);
        System.out.println("School Name:" + SchoolName);

        System.out.println("_______________________________________________");

    }
    public static void main(String[] args) {

        StaticVariable obj=new StaticVariable("Amit",101);
        obj.ShowDetails();


        StaticVariable obj1=new StaticVariable("Rajesh",102);
        obj1.ShowDetails();




    }
}
