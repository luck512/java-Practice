package OOPS.Inheritance.Multilevel;
class GameName{
    void Name(){
        System.out.println("game name is Cricket");
    }

}
class Caption extends GameName{
    void CaptionName(){
        System.out.println("Rohit Sharma is Caption");
    }

}
class Teams extends Caption{
    void Team(){
        System.out.println("team is Mumbai Indians");
    }

}
class Players extends Teams{
    void plays(){
        System.out.println("every team has 10 players");
    }

}

public class Game {
    public static void main (String[] args){
        Players P=new Players();
        P.Name();
        P.CaptionName();
        P.Team();
        P.plays();

    }
}
