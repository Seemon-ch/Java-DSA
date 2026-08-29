package arrays;
public class SearchINposition {
    public static int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        for(int i=0 ;i<nums.length ;i++){
            int mid = (start+end)/2;
                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid]>target ){
                    end = mid-1;
                }
                else{
                    start =mid+1;
                }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 6;
        int result =searchInsert(nums, target);
        System.out.println(result);
    }
}

