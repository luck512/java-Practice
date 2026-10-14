package RoughPrograms;

public class Exception {
    public static void main(String[] args)
    {
        DoStuff();
        try{
        System.out.println(10/0);

    }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

        public static void DoStuff(){

        DoMoreStuff();
        System.out.println("hii");
    }
    public static void DoMoreStuff(){
        System.out.println("Hello");

    }
}
