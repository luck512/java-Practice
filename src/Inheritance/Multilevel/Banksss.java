package Inheritance.Multilevel;
class SalaryAccount{
    void Salary(){
        System.out.println("only for salary");
    }

}
class CurrentAccount extends SalaryAccount{
    void current(){
        System.out.println("this is for Emergrncy");
    }

}
class SavingAccount extends CurrentAccount{
    void Saving(){
        System.out.println("This One is For Personal Use");
    }

}

public class Banksss {
    public static void main(String[] args){
        SavingAccount S=new SavingAccount();
        S.Salary();
        S.current();
        S.Saving();
    }
}
