package Loops.ForLoop;

public class FibonacciSeries {
    public static void main(String[] args){
        int no1=0, no2=1;
        System.out.print(no1+",");
        System.out.print(no2);

        int times=10;

        for(int i=1; i<=times;i++){
            int sum=no1+no2;
            System.out.print(","+sum);

            no1=no2;
            no2=sum;

        }
    }
}

