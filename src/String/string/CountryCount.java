package String.string;

public class CountryCount {
    public static void main(String[] args) {

        String str = "India,Pakistan,India,Pakistan,Pak,UK,US,UK,US";

        String[] countries = str.split(",");

        for (int i = countries.length - 1; i >= 0; i--) {
            System.out.println(countries[i]);
        }
    }
}
