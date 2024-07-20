package arrays;

public class BinarySubarrayGoal {
    public static int atMostSubArrays(int[] nums, int goal){
        int start = 0, totalCount = 0, currentSum = 0;
        for(int end = 0; end < nums.length; end++){
            currentSum += nums[end];
            while(start <= end && currentSum > goal){
                currentSum -= nums[start];
                start++;
            }
            totalCount += end - start + 1;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(atMostSubArrays(nums, goal) - atMostSubArrays(nums, goal -1));
    }
}
