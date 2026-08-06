package Operators.Logical;

public class LogicalOperators {
    public static void main(String[] args){
        int a=20,b=10,c= 10;

        //&& Operator if one condition is false it returns false
        System.out.println((a>b) && !(b==c));
        System.out.println((a>b) && !(a==b));

        //|| Operator if atleast one condition is true it returns true
        System.out.println((a<b) || (a>c));
        System.out.println(( a<b) || (a<b));

        // ! Operator if condition is true it make it flase we can called vice versa
        System.out.println(!(a<b));

    }
}
