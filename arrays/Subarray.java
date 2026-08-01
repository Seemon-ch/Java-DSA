package arrays;

import java.util.Scanner;

//print the subarrays.
public class Subarray {
    public void printSubarray(int arr[]){
        for(int start=0 ;start<arr.length ; start++){
            for(int end =start ; end <arr.length ;end++){
                for(int k=start ;k<=end ;k++){
                    System.out.print(arr[k]+" ");
                }
                System.err.println("");
            }
        }
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

            Subarray obj = new Subarray();
            obj.printSubarray(arr);
            
        }
}
}
