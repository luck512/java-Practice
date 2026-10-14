package ThisKeyword;

public class ConstructorChaining {
    ConstructorChaining(){
        this(5674,"laxman","laxman");
        System.out.println("this is no args Constructor");
    }
    ConstructorChaining(int no){
        this("Laxman",55);
        System.out.println("Changing :"+ no);
    }
    ConstructorChaining(String name,int no){

        System.out.println("Third Constructor");

    }
    ConstructorChaining(int no,String name,String name1){
        this(100);
        System.out.println("4th Constructor");

    }

    public static void main(String[] args) {
       ConstructorChaining obj=new ConstructorChaining();
    }
}
