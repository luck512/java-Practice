package Statements;

import java.util.Scanner;

public class VoteMachine {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
      int age= sc.nextInt();

        if(age<18){
            System.out.println("You Are Not Eligible For Vote");
        }
        else{
            System.out.println("You Are Eligible for vote");
        }
    }
}
