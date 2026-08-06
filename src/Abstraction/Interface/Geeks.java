package Abstraction.Interface;
interface AA{
    final int a=10;

    void show();

}
class BB implements AA{
    public void show(){
        System.out.println("Hello");
    }

}

public class Geeks {
    public static void main(String[] args){
        BB b=new BB();
        b.show();
        System.out.println(b.a);

    }
}
