package arrays;

import java.util.Scanner;

//find the smallest number form array.
public class SmallNum {
    public void findSmallest(int arr[] , int n){
        int smallest =Integer.MAX_VALUE;
        for(int i=0 ;i<arr.length ;i++){
            if(smallest >arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number is :" + smallest);
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
        SmallNum obj =new SmallNum();
        obj.findSmallest(arr,size);
        
    }
}
}
