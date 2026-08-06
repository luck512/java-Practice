package Loops.ForLoop;

public class SumOfNumbers {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 100; i++) {
            num=num+i;
        }
        System.out.println("sum of the nubers is:" + num);
    }
}