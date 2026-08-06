package Abstraction.Interface;

interface Addition{
    int add(int a,int b);

}
interface Substraction{
    int sub(int a,int b);

}
class Calculator implements Addition,Substraction{

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }

}

public class Multilevel {
    public static void main(String[] args){
        Calculator C=new Calculator();
        System.out.println("Addition:"+ C.add(5,6));
        System.out.println("Substraction:"+ C.sub(55,50));

    }
}
