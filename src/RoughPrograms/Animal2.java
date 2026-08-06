package RoughPrograms;

class Animal3{
    int Eyes;
    String name;
    String Color;

    public void ShowDetails(){
        System.out.println("No Of Eyes:" + Eyes);
        System.out.println("The Name Of The Animal:" + name);
        System.out.println("The color of Eyes Is :" + Color);
    }

}
public class Animal2 {
    public static void main(String[] args){
        Animal3 Dog=new Animal3();
        Dog.Eyes=2;
        Dog.name="Rana";
        Dog.Color="White";
        Dog.ShowDetails();


    }
}
