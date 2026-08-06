package Array;

public class FindMinimim {
    public static void main(String[] args){
        int arr[]={20,10,5};
        int min =arr[0];

        for(int i=1; i < arr.length; i++){
            if(arr[i] < min){

                min=arr[i];

            }
        }
        System.out.println( "The Minimum Number is " + min);
    }
}

