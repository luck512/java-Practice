package ThisKeyword;

public class ConstructorArgs {
    int rollno=101;
    ConstructorArgs(){

    }
    ConstructorArgs(ConstructorArgs s){
        System.out.println("Roll No:" + s.rollno);
    }
    void CreateObject(){
       ConstructorArgs obj= new ConstructorArgs(this);
    }

    public static void main(String[] args) {
        ConstructorArgs obj1=new ConstructorArgs();
        obj1.CreateObject();
    }
}
