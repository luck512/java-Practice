package RoughPrograms;
abstract class Veichle{
    public abstract int getNoofWheels();

}
class Bus extends Veichle{
    public int getNoofWheels(){
        return 4;
    }

}
class Auto extends Veichle{
    public int getNoofWheels(){
        return 3;
    }

}

public class Test {
    public static void main(String[] args){
        Bus B=new Bus();
        System.out.println(B.getNoofWheels());

        Auto A=new Auto();
        System.out.println(A.getNoofWheels());

    }
}
