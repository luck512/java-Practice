package RoughPrograms;

public class ReturnStatement {
    int sum(){
        int a=5,b=8;
        int result=a+b;
        return result;
    }
    public static void main(String[] args){
        ReturnStatement R=new ReturnStatement();
       int result= R.sum();
        System.out.println(result);
        int a=R.sum();
        System.out.println(a+500);


    }
}
