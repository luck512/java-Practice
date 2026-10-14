package ObjectClass.Equalsmethod;

public class Student {
    String name;
    int rollNo;
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public boolean equals(Object obj){
        Student S=(Student)obj;
        if(name.equals(S.name) && rollNo==S.rollNo){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        Student S1=new Student("Akash",101);
        Student S2=new Student("Santosh",102);
        Student S3=new Student("Akash",101);
        Student S4=S1;
        System.out.println(S1.equals(S2));
        System.out.println(S1.equals(S3));
        System.out.println(S1.equals(S4));
    }
}
