package sorting;

public class BubbleSort {
    //bubble sort = {T.C=O(n2)in all cases}
    public void bubbleSort(int arr[]){
        for(int i=0;i<arr.length ;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //optimized bubbble sort = { TC=O(n) in best case}
    public void bubbleSort2(int arr[]){
        for(int i=0;i<arr.length ;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true ;
                }
            }
            if(swapped ==true){
                break;
            }
        }
    }
    public void display(int arr[]){
        System.out.println("Sorted array is:-");
        for(int el :arr){
            System.out.print(el +" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,7,8,3,4,5};

        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(arr);
        obj.display(arr);
    }
}
