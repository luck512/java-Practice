package Static;
class Student {
    String name;
    int id;
    static String CollegeName="Deogiri college";
    static int studentrollno=0;
    static int  StudentCount;

    Student(String name,int id){
        this.name=name;
        this.id=id;
        studentrollno++;
        StudentCount++;
    }
    void ShowDetails(){
        System.out.println("Name:"+ name);
        System.out.println("id No:"+ id);
        System.out.println("College name:"+ CollegeName);
        System.out.println("Roll no:"+Student.studentrollno);

        System.out.println("---------------------------------------");
    }

}

public class College {
    public static void main(String[] args) {
        Student std=new Student("Ankush",545465465);
        std.ShowDetails();

        Student std1=new Student("Satish",58798787);
        std1.ShowDetails();

        Student std2=new Student("Sanket",524546849);
        std2.ShowDetails();

        Student std3=new Student("Sachin",555465465);
        std3.ShowDetails();

        System.out.println("Total Student:"+Student.StudentCount);

    }
}
