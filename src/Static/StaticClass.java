package Static;

public class StaticClass {
    int no=20;
    static int no1=50;



    static class xyz{
        void show(){
            System.out.println("Static class Method");
            System.out.println("No:"+no1 );
        }
    }

    public static void main(String[] args) {
        StaticClass.xyz obj=new StaticClass.xyz();
        obj.show();

    }
}
