package Constructor;
class ParentConstructor{
    ParentConstructor(){
        System.out.println("This Is Parent ");

    }
     ParentConstructor(int a,String b){
        System.out.println("Parent Constructor");

    }
    ParentConstructor(int a){
        System.out.println("2nd Parent Constructor");
    }

}

public class ConstructorChaining  extends ParentConstructor{
    ConstructorChaining(){

        System.out.println("Child Constructor");

    }

    public static void main(String[] args){
        ConstructorChaining obj=new ConstructorChaining();



    }

}
