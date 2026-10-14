package ThisKeyword;

class MixParent{
    MixParent(){
        System.out.println("no args Mix Parent");//1

    }
    MixParent(int no, String name){
        this();
        System.out.println("2 args mixParent");//2

    }

}
public class SuperThisText extends MixParent {

    SuperThisText(){
        super(55,"somesh");
        System.out.println("Child No Args Constructor");//3

    }
    SuperThisText(String name1,boolean n){
        this();
        System.out.println("Child 2 ars Constructor");//4

    }

    public static void main(String[] args) {
        SuperThisText Child=new SuperThisText("Laxman",false);
    }

}
