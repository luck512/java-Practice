package ExceptionHandeling;

public class IntroToException {
    public static void main(String[] args) {
        System.out.println("Start");
        try{

        int a=10/0;
            }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide BY 0");

        }
        finally {
            System.out.println("Executed");
        }



    }

}
