package arrays;

public class SearchSingleNoInConstantTime {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={2,2,3,4,1,1,3};
        int res = singleNumber(nums);
        System.out.println(res);
        }

}

