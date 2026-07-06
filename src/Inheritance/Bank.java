package Inheritance;
class AccountHolder{
    void name(){
        System.out.println("The Account Holder Name sumit");
    }

}
class AccountNo extends AccountHolder{
    void number(){
        System.out.println("The Account No is 54666565686546");
    }

}

public class Bank {
    public static void main(String[] args){
        AccountNo obj1=new AccountNo();
        obj1.number();
        obj1.name();
    }
}
