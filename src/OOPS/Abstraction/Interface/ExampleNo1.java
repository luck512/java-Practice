package OOPS.Abstraction.Interface;
interface II{
    final int a=10;
    default void show(){
        System.out.println("This is Default");
    }
}

public class ExampleNo1 implements II {
    public static void main(String[] args){
        ExampleNo1 E=new ExampleNo1();
        E.show();

    }
}
