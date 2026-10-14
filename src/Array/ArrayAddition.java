package Array;

public class ArrayAddition {
    public static void main(String[] args) {
        int sum = 8;
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i=0;i<= arr.length-2;i++){
            for(int j=0;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}