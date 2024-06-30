package StriverSDESheet;

public class KadanesAlgo {
    public static int maxSubarray(int[] nums, int n){
        int max = nums[0];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,-3,5,6,-2};
        int n = nums.length;
        System.out.println(maxSubarray(nums, n));
    }
}
