package OOPS.Inheritance.herichical;
class States{
    void Together(){
        System.out.println("When All States Are In One Becomes Country");
    }

}
class Districts extends States{
    void Become(){
        System.out.println("All Districts Become one Makes State");
    }

}
class Cities extends States{
    void makes(){
        System.out.println("when all cites becomes one makes it District");
    }

}
class Villages extends States{
    void Are(){
        System.out.println("when all Villages Become one Makes It City");
    }

}

public class Country {
    public static void main(String[] args){
        Villages V=new Villages();
        V.Together();
        V.Are();


        Cities C=new Cities();
        C.Together();
        C.makes();

        Districts D=new Districts();
        D.Together();
        D.Become();




    }
}
