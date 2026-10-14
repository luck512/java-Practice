package OOPS.Inheritance.Multilevel;
class Banks{
    void intrest(){
        System.out.println("this bank provides intrest");
    }

}
class sbi extends Banks {
    void loan(){
        System.out.println("this bank provide loan");
    }

}
class SbiBranch extends sbi{
    void Branch(){
        System.out.println("pune");
    }

}
class MainBranch extends SbiBranch{
    void Main(){
        System.out.println("jalna");
    }

}

public class Sbi {
    public static void main(String[] args){
        MainBranch obj=new MainBranch();
        obj.intrest();
        obj.loan();
        obj.Branch();
        obj.Main();
    }

}
