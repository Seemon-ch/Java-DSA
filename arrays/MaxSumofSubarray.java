package arrays;
import java.util.Scanner;
//find max subarray sum from all the subarray.

//BRUTE FORCE APPROACH
public class MaxSumofSubarray {
    public void maxSumofSubarray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
            for(int start=0 ;start<arr.length ; start++){
                for(int end =start ; end <arr.length ;end++){
                        int sum =0;
                        for(int k=start ;k<=end ;k++){
                            sum +=arr[k];
                        }
                    if(sum > maxSum){
                        maxSum = sum;
                    }
                }
            }
            System.out.println("max sum is :"+ maxSum);
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

            MaxSumofSubarray obj =new MaxSumofSubarray();
            obj.maxSumofSubarray(arr);
            
        }
        }
}
