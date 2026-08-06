package RoughPrograms;
class Animal1{
    void eat(){
        System.out.println("eating");
    }
    void runnung(){
        System.out.println("Running ");
    }

}

public class ClassObject {
    public static void main(String[] args){
        Animal1 Elephant=new Animal1();
        Elephant.eat();
        Elephant.runnung();


    }
}
