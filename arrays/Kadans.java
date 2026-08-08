//efficeint way to find max subarray sum.

import java.util.Scanner;
public class Kadans{
    public static void kadans(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currentsum =0;
        for(int i=0 ;i<arr.length ;i++){
            currentsum += arr[i];
            if(currentsum >maxsum ){
                maxsum =currentsum;
            }
            if(currentsum <0 ){
                currentsum =0;
            }

        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter size of array");
            int size = sc.nextInt();
            System.out.println("enter array elements");
            int arr[] = new int[size];
            for(int i=0 ;i<arr.length ;i++){
                    arr[i]=sc.nextInt();
            }
            kadans(arr);
            
        }
        }
}