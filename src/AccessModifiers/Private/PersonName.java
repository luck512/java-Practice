package AccessModifiers.Private;
class Name{
    String s="laxman";
    void Display(){
        System.out.println("My Name Is"+ s);
    }
}

public class PersonName {
    public static void main (String[] args){
        Name n=new Name();
        n.Display();
    }
}
