package accessmodifier;

class AccountHolderinfo {

    private int accountNo;
    private String name;

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Bank {
    public static void main(String[] args) {

        AccountHolderinfo obj = new AccountHolderinfo();

        obj.setAccountNo(101);
        obj.setName("Laxman");

        System.out.println(obj.getAccountNo());
        System.out.println(obj.getName());
    }
}