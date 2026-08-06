package sorting;

public class CountingSort {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            largest =Math.max(largest ,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length ;i++){
            count[arr[i]]++;
        }

        int j =0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
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
        countingSort(arr);
        display(arr);
    }
}
