package searching;

import java.util.Scanner;

public class BinarySearch {
    public int binarySearch(int arr[], int key){
        int beg =0 ;
        int end = arr.length -1;
        while(beg <= end){
            int mid =beg+ (end -beg)/2;

            if(arr[mid] == key){
               return mid;
            }
            else if(arr[mid] <key){
                beg = mid +1 ;
            }
            else{
                end = mid -1;
            }
        }
        return -1 ;

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

            System.out.println("enter the element to search");
            int key = sc.nextInt();

            BinarySearch obj = new BinarySearch();
            int result = obj.binarySearch(arr ,key); 

            if(result == -1){
                System.out.println("element not found");
            }
            else{
                System.out.println("element found at " + result );
            }



        }
    }
}
