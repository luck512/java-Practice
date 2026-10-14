package ObjectClass.Clone;

class Cat{
    int j;
    Cat(int j){
        this.j=j;
    }
}
class Dog implements Cloneable{
    Cat c;
    int i;
    Dog(Cat c,int i){
        this.c=c;
        this.i=i;


    }
    public Object clone()   throws CloneNotSupportedException{
        return super.clone();
    }

}


public class ShallowCloaning {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Cat c=new Cat(10);
        Dog d=new Dog(c,10);
        System.out.println(d.i+"..."+d.c.j);

        Dog d2=(Dog)d.clone();
        d2.i=888;
        d2.c.j=999;

        System.out.println(d.i+"..."+d.c.j);

    }
}
