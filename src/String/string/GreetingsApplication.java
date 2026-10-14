package String.string;
import java.util.*;

public class GreetingsApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Plese Enter Your City Name");
        String name=sc.nextLine().toLowerCase().trim();
        if(name.equals("hydrabad")){
            System.out.println("Hello Hydrabadi , Walekum Walekum");
        }
      else if(name.equals("chennai")){
            System.out.println("Hello Madarashi, Waddakum");
        }
      else if(name.equals("pune")){
            System.out.println("Euuuuuu");

        }
        else {
            System.out.println("Please Enter Valid City Name");
            }
      }
    }



