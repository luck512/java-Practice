package String.string;


public class EachCount {

    public static void main(String[] args) {

        String str = "abc %$java PROGRAMMING 123#@";

        int upper = 0;
        int lower = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {

            int ch = str.charAt(i);

            if (ch >= 65 && ch <= 90) {
                upper++;
            }
            else if (ch >= 97 && ch <= 122) {
                lower++;
            }
            else if (ch == '%' || ch == '$' || ch == '#' || ch == '@') {
                special++;
            }
        }

        int total = str.length();

        double specialPercentage = (special * 100.0) / total;
        double result = (specialPercentage * total) / 100;

        System.out.println("Total = " + total);
        System.out.println("Special = " + special);
        System.out.println("Special Percentage = " + specialPercentage);
        System.out.println("Result = " + result);
    }
}