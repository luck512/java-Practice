package Loops.WhileLoop;

public class ReverseNo {
    public static void main(String[] args){
        int no=588378;

        int revno=0;

        while(no != 0){

            int remainder=no %10;
           revno= revno*10+remainder;
           no=no/10;

        }
        System.out.println(revno);
    }
}
