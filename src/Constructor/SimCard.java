package Constructor;
class Sim {
    int phoneNo;
    String ownerName;

    Sim(int No, String owner) {
        phoneNo = No;
        ownerName = owner;

    }
}

public class SimCard {
    public static void main(String[] args){
        Sim S=new Sim(934546546,"Rushi");
        System.out.println(S.phoneNo);
        System.out.println(S.ownerName);

    }
}

