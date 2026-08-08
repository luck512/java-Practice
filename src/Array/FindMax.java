package Array;

public class FindMax {
    public static void main(String[] args){

        int arr[]={40,50,60};

        int max = arr [0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max ){
                max=arr[i];
            }
        }
        System.out.println(" The Maximum Value Is: " + max);
    }
}
