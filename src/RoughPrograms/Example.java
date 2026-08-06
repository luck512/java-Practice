package RoughPrograms;
class A{
    void ShowMe(){

    }

}
class B extends A{
    void ShowMe(){

    }

}

public class Example  extends B{
    @Override
    void ShowMe(){
        System.out.println("Method Overriding");
    }
    public static void main(String[] args){
        Example E=new Example();
        E.ShowMe();


    }
}
