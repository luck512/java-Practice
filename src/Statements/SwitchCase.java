package Statements;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Button=sc.nextInt();
        switch(Button){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("INVALID");
        }
    }
}
