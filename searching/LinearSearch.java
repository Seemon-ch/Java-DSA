package searching;
import java.util.Scanner;
public class LinearSearch {

    public int linearSearch(int arr[], int key){
        for(int i=0;i<arr.length ;i++){
            if(arr[i]==key){
                System.out.println("Element found at index : "+ i);
                return 0;
            }
        }
        System.out.println("Element not found");
        return 0;

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

            LinearSearch obj = new LinearSearch();
            obj.linearSearch(arr ,key); 


        }
    }
}
