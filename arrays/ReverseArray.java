package arrays;

import java.util.Scanner;

public class ReverseArray {
    public void reverse(int[] arr) {
        int start =0 ;
        int end = arr.length -1;

        while(start <end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start ++;
            end--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String arg[]){
        try (Scanner sc =new Scanner(System.in)){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        ReverseArray obj = new ReverseArray();
        obj.reverse(arr);
    }
    }
}

    

