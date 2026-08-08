package Constructor;
class Constructor{
    public Constructor(int rollno,String name)
    {
        System.out.println("Roll No:"+ rollno +"Name:"+name);

    }
}

public class Calling {
    public static void main(String[] args)
    {
        Constructor C=new Constructor(55,"laxman");



    }
}
