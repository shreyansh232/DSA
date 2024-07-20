package arrays;

public class MaxPointsCards {
    public static int maxScore(int[] nums, int k) {
        int n = nums.length;
        int leftSum = 0, rightSum = 0, maxSum = 0;
        for(int i = 0; i < k; i++){
            leftSum += nums[i];
        }
        maxSum = leftSum;
        int rightIndex = n - 1;
        for(int i = k - 1; i >= 0; i--){
            leftSum -= nums[i];
            rightSum += nums[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, (leftSum + rightSum));
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,6,7,2,1};
        int k = 4;
        System.out.println(maxScore(nums, k));
    }
}
