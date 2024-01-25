package arrays;

import java.util.Arrays;

public class nextPermutation31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        // Step 1: Find the break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no break point, reverse the array and return
        if (ind == -1) {
            reverseArray(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element and swap
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }

        // Step 4: Reverse the right half
        reverseArray(nums, ind + 1, n - 1);
    }

    // Helper method to reverse a portion of the array
    private void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        nextPermutation31 solution = new nextPermutation31();
        int[] nums = {2, 1, 5, 4, 3, 0, 0};
        solution.nextPermutation(nums);

        System.out.print("The next permutation is: " + Arrays.toString(nums));
    }
}
