package Constructor;
class Grandparent{
    void show(){
        System.out.println("show");
    }
    Grandparent(){

        System.out.println("Grandparent no args");
    }
    Grandparent(int a){
        System.out.println("with 1 args");

    }

}
public class Parent extends Grandparent{
    void display(){
        System.out.println("Child Display");
    }
    Parent(){
        super();
        System.out.println("Default Parent");
    }
    Parent(String b){
        System.out.println("1 Pararameter");
    }

    public static void main(String[] args) {
        Parent p=new Parent();

    }

}
