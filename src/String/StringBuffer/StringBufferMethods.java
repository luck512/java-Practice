package String.StringBuffer;

import java.sql.SQLOutput;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Durga");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(4));
        sb.setCharAt(4,'u');
        System.out.println(sb);
        sb.append("Solutions");
        sb.append(3.14);
        sb.append(true);
        System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);
    }
}
