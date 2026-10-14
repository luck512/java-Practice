package OOPS.Inheritance.Hybrid;
class GrandFather{
    void Grand(){
        System.out.println("he is Head of the family");
    }

}
class Father extends GrandFather{
    void Next(){
        System.out.println("After Them Becomes Head of the Family");
    }

}
class Child1 extends Father{
    void next(){
        System.out.println("He is First Child");
    }

}
class Child2 extends Father{
    void Last(){
        System.out.println("he is the Youngest in Family");
    }


}

public class Home {
    public static void main(String[] args){
        Child2 C=new Child2();
        C.Grand();
        C.Next();
        C.Last();

        Child1 CC=new Child1();
        CC.Grand();
        CC.Next();
        CC.next();

        Father F=new Father();
        F.Grand();
        F.Next();
    }
}
