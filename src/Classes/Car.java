package Classes;

public class Car {
        public void Driving (){
            System.out.println("im adriving the car too fast");
        }

        public static void main(String[] args) {
            Car toyota =new Car();
            Car blue=new Car();
            blue.color();
            toyota.Driving();


        }
        public void color(){
            System.out.println("the car is so colorful");
        }

    }
