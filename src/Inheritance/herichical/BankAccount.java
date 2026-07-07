package Inheritance.herichical;
class Account {
    void deposit() {
        System.out.println("Money Deposited");
    }
}

class SavingAccount extends Account {
    void savingInterest() {
        System.out.println("Saving Account Interest");
    }
}

class CurrentAccount extends Account {
    void overdraft() {
        System.out.println("Current Account Overdraft");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.deposit();
        s.savingInterest();

        CurrentAccount c = new CurrentAccount();
        c.deposit();
        c.overdraft();
    }
}
