package Inheritance.Multilevel;
class Transport{
    void move(){
        System.out.println("From one place to another");
    }

}
class Train extends Transport{
    void railwaytrack(){
        System.out.println("Train runs on the track");

    }

}
class Metro extends Train{
    void metrostation(){
        System.out.println("metro stops at metrostation");
    }

}

public class TransportMedium {
    public static void main(String[] args){
        Metro m=new Metro();
        m.move();
        m.railwaytrack();
        m.metrostation();
    }
}
