package Static;
class Demo{

    void ShowStatic(){
        System.out.println("Instance method ");
        Show();
    }

    static void Show(){
        System.out.println("Static method");
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        Demo D=new Demo();
        D.ShowStatic();

        Demo.Show();

    }
}
