package arrays;

//find the sum of subarrays - optimized approach - prefix sum approach;

class FindMaxSubarraySum{
    //find the sum of all subarray.
    public void findSubarraySum(int arr[]){
        int perfix[] = new int[arr.length];
        perfix[0]=arr[0];
        for(int i=1 ;i<arr.length;i++){
            perfix[i]=perfix[i-1]+arr[i];
        }
        for(int start=0 ;start<arr.length ;start++){
            for(int end =start ; end<arr.length ;end++){
                int sum;
                if(start==0){
                    sum =perfix[end];
                }
                else{
                    sum=perfix[end]-perfix[start-1];
                }
            System.out.println(sum);
            }
        }
    }

    //find the maxSum.
    public void findMaxSum(int arr[]){
        int perfix[] = new int[arr.length];
        perfix[0]=arr[0];
        for(int i=1 ;i<arr.length;i++){
            perfix[i]=perfix[i-1]+arr[i];
        }
        int maxSum =Integer.MIN_VALUE;
        for(int start=0 ;start<arr.length ;start++){
            for(int end =start ; end<arr.length ;end++){
                int sum;
                if(start==0){
                    sum =perfix[end];
                }
                else{
                    sum=perfix[end]-perfix[start-1];
                }

                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
public class PrefixSum {
    public static void main(String args[]){
        int arr[]={2,4,6,8};
        FindMaxSubarraySum obj = new FindMaxSubarraySum();
        // obj.findSubarraySum(arr);
        obj.findMaxSum(arr);
    }
}
