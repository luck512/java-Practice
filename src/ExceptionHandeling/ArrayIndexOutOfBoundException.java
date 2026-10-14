package ExceptionHandeling;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
       try{   int arr[] ={10,20,30,40,50};
           arr[0]=10;
           arr[1]=20;
           arr[2]=30;
           arr[3]=40;
           arr[4]=50;
        System.out.println(arr[5]);
           } catch (Exception e) {
           System.out.println("Invalid Index");

       }
       }
}
