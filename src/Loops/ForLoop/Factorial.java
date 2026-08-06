package Loops.ForLoop;

public class Factorial {
    public static void main(String[] args){
        int n=5;
        long Factorial=1;
        for(int i=1; i<=n; i++){
            Factorial*=i;

        }
        System.out.println(n + " != " + Factorial);

    }
}
