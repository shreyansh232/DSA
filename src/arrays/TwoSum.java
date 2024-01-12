package arrays;

public class TwoSum {
    public static int twoSum(int[] nums, int target){
        int n = nums.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    continue;
                }
                if (nums[i] + nums[j] == target){
                    return nums[i] + nums[j];
                }
            }
        }
        // You might want to handle the case where no such pair is found
        // by returning a specific value or throwing an exception.
        return -1;  // or throw new IllegalArgumentException("No such pair found");
    }
}
