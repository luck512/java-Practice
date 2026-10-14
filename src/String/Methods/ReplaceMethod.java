package String.Methods;

public class ReplaceMethod {
    public static void main(String[] args) {
        String s="ababab";
        System.out.println(s.replace('a','b'));

        System.out.println(s.replaceAll("a","-"));
    }
}
