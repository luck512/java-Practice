package Inheritance.Multilevel;
class Vechicle{
    void Wheeler(){
        System.out.println("four Wheeler");
    }

}
class Name extends Vechicle{
    void Carname(){
        System.out.println("IIIM5");
    }

}
class Brand extends Name{
    void BrandName(){
        System.out.println("BMW");
    }


}

public class car {
    public static void main (String[] args){
        Brand b=new Brand();
        b.Wheeler();
        b.Carname();
        b.BrandName();

    }
}
