package sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length-1 ;i++){
            int key = arr[i+1];
            int prev =i ;

            while(prev>=0 && arr[prev]>key){
                arr[prev+1] =arr[prev];
                prev--;
            }
            arr[prev+1] =key;
        }
    }
    
    public static void display(int arr[]){
        System.out.println("Sorted array is:-");
        for(int el :arr){
            System.out.print(el +" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,7,8,3,4,5};
        insertionSort(arr);
        display(arr);
    }
}
