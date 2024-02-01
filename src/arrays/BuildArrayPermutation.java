package arrays;

import java.util.Arrays;

public class BuildArrayPermutation {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            // Check if nums[i] is a valid index
            if (nums[i] < n) {
                ans[i] = nums[nums[i]];
            } else {
                // Handle invalid index, set a default value or handle it based on your requirement
                ans[i] = nums[0];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4, 8};
        int[] ans = buildArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}
