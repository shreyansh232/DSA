package arrays;

public class PS2962 {
    public static long countSubarrays(int[] nums, int k) {
        long maxNum = Long.MIN_VALUE, count = 0;
        long left = 0, right = 0, ans = 0;

        // Find the maximum element in the array
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        while (right < nums.length || left > right) {
            if (nums[(int)right] == maxNum) {
                count++;
            }
            // If count is greater than or equal to k, calculate subarrays count
            while (count >= k) {
                if (nums[(int)left] == maxNum) {
                    count--;
                }
                left++;
                ans += nums.length - right;
            }
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,3,3};
        int k = 2;
        long ans = countSubarrays(nums, k);
        System.out.println(ans);
    }
}
