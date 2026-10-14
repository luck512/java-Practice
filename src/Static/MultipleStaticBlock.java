package Static;

class Demo1{
    static int x=0;
    static{
        System.out.println("Static Block 1");

    }
    Demo1(){
        System.out.println("Demo constructor");
        System.out.println(x);
       ++x;
    }
    static{
        System.out.println("Static Block 2");
    }

}
public class MultipleStaticBlock {
    public static void main(String[] args) {
        Demo1 demo=new Demo1();
        Demo1 demo1=new Demo1();



    }
}
