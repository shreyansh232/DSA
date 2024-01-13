package arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    // Return an array containing the indices of the pair
                    return new int[]{i, j};
                }
            }
        }
        // Return an array indicating that no such pair is found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 1, 9};
        int target = 10;
        int[] indices = twoSum(nums, target);

        // Check if a valid pair is found
        if (indices[0] != -1) {
            System.out.println("Indices of the pair: " + indices[0] + ", " + indices[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}
