package OOPS.Polymorphism.CompileTime;

// also Known as 1)Static Binding 2)Early Binding // Method Overloading
//In compile Time OOPS.Polymorphism there two methods with same name but methods paremeters are different so when we called
//method m1() which means compiler know the which Method is we Are Calling That is called Compile time polymorphism

class Demo1{
    public void m1(String name){

        System.out.println("Name is :" + name);
    }
    public void m1(int number1 , int number2){

        System.out.println("sum is : " + (number1 + number2));
    }
    public void m1(){
        System.out.println("Method M1");
    }
    public void m1(int num,String name){
        System.out.println("Roll no:"+num+"Name : "+name);
    }

}
public class Demo {
    public static void main(String[] args){
        Demo1 D=new Demo1();
        D.m1("Laxman");
        D.m1(55,44);
        D.m1();
        D.m1(55,"Laxman");

        Demo d=new Demo();
        d.main(new int[]{10,20,30});
    }
    public static void main(int[] args){
        System.out.println("This Main Method Overloading");
    }
}
