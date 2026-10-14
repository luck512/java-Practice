package Loops.Pattern;

public class NumberPattern1 {
    public static void main(String[] args){
        int no=5;
        for(int i=no; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+"");
            }
            System.out.println("");
        }
    }
}
