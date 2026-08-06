package RoughPrograms;
import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double balance=1000;
        int choice;
        while(true){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. EXIT");


            System.out.println("Please Enter Your Choice");
            choice= sc.nextInt();

            if(choice ==1) {
                System.out.println(" Check Balance $ " + balance);
            }
            else if (choice==2) {
                System.out.println(" Deposit Money $ ");


            }
        }




    }
}
