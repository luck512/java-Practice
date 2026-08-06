package Statements;
import java.util.Scanner;
public class SwitchCase1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        switch(name){

            case"Sunday":
                System.out.println("day 1");
                break;
            case"Monday":
                System.out.println("day 2");
                break;
            case"Tuesday":
                System.out.println("day 3");
                break;
            case"Wednesday":
                System.out.println("day 4");
                break;
            case"Thursday":
                System.out.println("day 5");
                break;
            case"Friday":
                System.out.println("day 6");
                break;
            case"Saturday":
                System.out.println("day 7");
                break;
            default:
                System.out.println("INVALID DAY");


        }
    }
}
