package Loops.ForLoop;

public class PrintFibonacci {
    public static void main(String[] args){
        int a=0,b=1;
        System.out.print(a+","+b);

        int times=10;
        for(int i=1;i<=times;i++){
            int sum=a+b;
            System.out.print(","+ sum);
            a=b;
            b=sum;

        }

    }
}
