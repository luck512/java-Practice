package Classes;

public class Methods1 {
    static void show() {
        System.out.println("this is methods1");
    }
    void addition(int a, int b){
        int result =a+b;
        System.out.println(result);

    }
    int returnValue(){
        return 500;
    }
    int Addition (int a,int b){
        int c=a+b;
        return c;
    }

    public static void main() {
        Methods1.show();
    }
}
