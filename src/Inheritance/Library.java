package Inheritance;
class Book{
    void read(){
        System.out.println("Reading The Book");
    }

}
class ScienceBook extends Book{
    void Expriment(){
        System.out.println("making Science Project From Book");
    }

}

public class Library {
   public static void main(String[] args) {
       ScienceBook B=new ScienceBook();
       B.read();
       B.Expriment();

    }
}
