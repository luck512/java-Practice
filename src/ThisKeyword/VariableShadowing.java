package ThisKeyword;

public class VariableShadowing {
    int no;
    String name;

    VariableShadowing(int no,String name){
       this. no=no;
        this.name=name;

    }
    void display(){
        System.out.println(this.no);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        VariableShadowing obj=new VariableShadowing(101,"Laxman");
        obj.display();
    }
}
