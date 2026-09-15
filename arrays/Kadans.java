//efficeint way to find max subarray sum.
package arrays;

import java.util.Scanner;
public class Kadans{

    //kadans-without handling all negative caes;
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

    //modified kadans
    public static void kadansModified(int arr[]){
        int maxSum=arr[0];
        int currentSum =arr[0];
        for(int i=1 ;i<arr.length ;i++){
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println("Max sum is :" + maxSum);
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
            kadansModified(arr);
                
            }
        }
}