package ThisKeyword;

public class Studentclass {
    int rollno=101;
    void display(){
        System.out.println(this.rollno);
    }

    public static void main(String[] args) {
        Studentclass obj=new Studentclass();
        obj.display();
    }

}
