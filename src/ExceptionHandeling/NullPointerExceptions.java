package ExceptionHandeling;

public class NullPointerExceptions {
    public static void main(String[] args) {
        try{
        String s=null;

        System.out.println(s.length());
            } catch (NullPointerException e) {
            String s="akash";
            System.out.println(s.length());
        }
        }
}
