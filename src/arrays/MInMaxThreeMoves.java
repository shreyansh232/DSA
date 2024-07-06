package arrays;

import java.util.Arrays;

public class MInMaxThreeMoves {
    public static int minDifference(int[] nums) {
        if(nums.length <= 4){
            return 0;
        }
        Arrays.sort(nums);
        int k = nums.length - 3;
        int ans = nums[nums.length - 1] - nums[0];
        for(int i = k - 1; i < nums.length; i++){
            ans = Math.min(ans, nums[i] - nums[i - k + 1]); //same as choosing first 3 last elements then 2 last elements and 1 from the start and so on.
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,1,2,4,6};
        System.out.println(minDifference(nums));
    }
}
