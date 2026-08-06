package RoughPrograms;
abstract class Animal {
    abstract void walks();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created A Horse");
    }
    public void walks() {
        System.out.println("walks On 4 Legs");
    }
}

public class OOps {
    public static void main(String[] args){
        Horse horse=new Horse();




    }
}
