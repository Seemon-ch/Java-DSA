package arrays;

import java.util.Scanner;

//find the largest number form array
public class LargNum {
    public void findLargest(int arr[] , int n){
        int largest =Integer.MIN_VALUE;
        for(int i=0 ;i<arr.length ;i++){
            if(largest <arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("largest number is :" + largest);
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
        LargNum obj =new LargNum();
        obj.findLargest(arr,size);
        
    }
}
}
