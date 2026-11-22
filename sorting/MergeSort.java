package sorting;

import java.util.Arrays;
public class MergeSort {
    static void mergeSort(int arr[], int p, int r) {
        if (p>=r) {
            return;
        }
        int mid = p+ (r -p) / 2;
        mergeSort(arr, p, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, p, mid, r);
    }

    static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (i = si, k = 0; i <= ei; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 10, 5, 20, 15};
        System.out.println("Original Array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}