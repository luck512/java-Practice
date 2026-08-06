package RoughPrograms;

class Name{
    Name(String name,int id){
        System.out.println("Student name is :" + name + " Student Id is " + id );
    }
}

public class Constructor {
    public static void main(String[] args){
        Name N=new Name("laxman",37462384);
        Name s=new Name("Raut" ,545654);
    }
}
