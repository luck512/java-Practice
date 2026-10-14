package AccessModifiers.Public;

abstract class TV{
    abstract void TurnON();
    abstract void TurnOFF();

}
class TvRemote extends TV{
    void TurnON(){
        System.out.println("tv is on");
    }
    void TurnOFF(){
        System.out.println("tv is off");
    }

}

public class Abstraction {
    public static void main(String[] args){
        TvRemote T=new TvRemote();
        T.TurnON();
        T.TurnOFF();
    }
}
