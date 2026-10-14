package Static;
class StaticBlocks{
    int a;
    String b;
    static String S;

    static{
          S="ABP College";
    }

    StaticBlocks(int a, String b){
        this.a=a;
        this.b=b;


    }
    void showDetails(){
        System.out.println("Roll no:"+a);
        System.out.println("Name:"+ b);
        System.out.println("College:"+ S);

        System.out.println("-------------------------------------------------------");
    }

}

public class StaticBlock {
    public static void main(String[] args) {
        StaticBlocks ss=new StaticBlocks(101,"Akash");
        ss.showDetails();

        StaticBlocks ss1=new StaticBlocks(102,"Aditya");
        ss.showDetails();


    }
}
