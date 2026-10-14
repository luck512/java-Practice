package OOPS.Inheritance.herichical;
class Owner{
    void Order(){
        System.out.println("Owner Giving Order To Servent To Serve Tea");
    }
}
class Servent extends Owner{
    void Listning(){
        System.out.println("He Is Listning What The Order Was Given For Tea");
    }

}
class Customer extends Owner{
    void Asking(){
        System.out.println("Asking to give me Tea");
    }

}

public class TeaStall {
    public static void main(String[] args){
        Servent S=new Servent();
        S.Order();
        S.Listning();

        Customer C=new Customer();
        C.Order();
        C.Asking();

    }
}
