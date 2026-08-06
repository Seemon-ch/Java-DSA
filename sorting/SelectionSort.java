package sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length ;i++){
            int smallestIndex =i ;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[smallestIndex]){
                    smallestIndex =j ;
                }
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] =temp;
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
        selectionSort(arr);
        display(arr);
    }
}

