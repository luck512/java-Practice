package Loops.WhileLoop;

public class Reverse {
    public static void main(String[] args){
        int No = 54768;

        int rev = 0;

        while(No != 0){
            int rem=No % 10;
            rev = rev * 10 + rem;
            No = No / 10;
        }
        System.out.println( rev );
    }
}
