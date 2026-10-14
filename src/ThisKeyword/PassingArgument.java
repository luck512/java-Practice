package ThisKeyword;

public class PassingArgument {
    int rollno=101;

    void show(PassingArgument s ){
        System.out.println("Roll no "+ s.rollno);
    }
    void display(){
        show(this);
    }

    public static void main(String[] args) {
        PassingArgument obj=new PassingArgument();
        obj.display();

    }
}
