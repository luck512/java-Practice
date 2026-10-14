package ThisKeyword;

public class CurrentObjectsMethod {
    void play(){
        System.out.println("Playing Cricket");
    }
    void display(){
        this.play();
        System.out.println("Yesss");
    }

    public static void main(String[] args) {
      CurrentObjectsMethod obj=new CurrentObjectsMethod();
        obj.display();
    }
}
