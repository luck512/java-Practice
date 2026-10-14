package ExceptionHandeling;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Outer Try Block");

        try{
            System.out.println("Inner Try Block");
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Inner Catch Block");
            }
            System.out.println("OutSide Inner Try Catch Block");

        } catch (Exception e) {
            System.out.println("Outer Catch Block");
        }finally {
            System.out.println("Outer Finally  Block");
        }

    }
}
