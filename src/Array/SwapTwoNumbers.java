package Array;

public class SwapTwoNumbers {
    public static void main(String[] args){
        int arr[]={10,20};

        arr[0]= arr[0] + arr[1];
        arr[1]= arr[0] - arr[1];
        arr[0]= arr[0] - arr[1];

        System.out.println(" index 0 :"+arr[0]);
        System.out.println(" index 1 :"+arr[1]);
    }
}
