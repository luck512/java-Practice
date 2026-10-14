package ThisKeyword;
//this keyword refers to the current class instance Variable

public class IntroToThisKeyword {
    int no=10;

    void show(int no){
        System.out.println(this.no);
        System.out.println(no);
    }
    public static void main(String[] args){
        IntroToThisKeyword obj=new IntroToThisKeyword();
        obj.show(20);
    }

    }

