package Classes;

public class MethodCallingPractice {
    public static void main(String[] args){
        MethodCallingPractice obj=new MethodCallingPractice();
      int tempResult=obj.Addition(40,50,60);
      tempResult=tempResult+50;
        System.out.println("final addition is " + tempResult);
    }
    int Addition (int a,int b,int c){
        int result=a+b+c;
        return result;

    }
}


