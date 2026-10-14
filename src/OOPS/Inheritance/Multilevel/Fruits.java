package OOPS.Inheritance.Multilevel;
class Color{
    void Yellow(){
        System.out.println("The Fruits color is Yellow");
    }

}
class Mango extends Color{
    void Brand(){
        System.out.println("This Is Hapus");
    }

}
class Taste extends Mango{
    void taste(){
        System.out.println("Sweet");
    }
}

public class Fruits {
    public static void main (String[] args){
        Taste T=new Taste();
        T.Yellow();
        T.Brand();
        T.taste();
    }
}
