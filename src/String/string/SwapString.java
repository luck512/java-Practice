package String.string;

public class SwapString {
    public static void main(String[] args) {
        String str1="Laxman";
        String str2="Raut ";;

        String temp=str1;
        temp=str2;
        str2=temp;

        System.out.println(str2+str1);

    }
}
