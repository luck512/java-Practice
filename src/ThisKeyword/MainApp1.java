package ThisKeyword;

public class MainApp1 {

    MainApp1(){
        System.out.println("Constructor1 Executed");
        new MainApp1(this);


    }
    MainApp1(MainApp1 s){
        System.out.println("Constructor2 Executed");

    }
    public static void main(String[] args) {
        MainApp1 obj=new MainApp1();


    }
}
