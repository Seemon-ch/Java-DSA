package arrays;

import java.util.Scanner;

//print the Pairs in an array.
public class Pairs {

    public void printPairs(int arr[]){
        for(int i=0;i<arr.length ;i++){
            for(int j=i+1 ; j<arr.length ;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
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

            Pairs obj =new Pairs();
            obj.printPairs(arr);
            
        }
}
}
