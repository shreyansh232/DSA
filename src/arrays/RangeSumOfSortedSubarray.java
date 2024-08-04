package arrays;
import java.util.*;

public class RangeSumOfSortedSubarray {
    private static final int MOD = 1_000_000_007;

    public static int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> res = new ArrayList<>();

        // Generate all possible subarray sums
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                res.add(sum);
            }
        }

        // Sort the list of sums
        Collections.sort(res);

        // Calculate the sum of elements in the range [left, right)
        long resSum = 0; // Use long to avoid overflow
        for (int i = left - 1; i < right; i++) {
            resSum = (resSum + res.get(i)) % MOD;
        }

        return (int) resSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = 4, left = 1, right = 5;
        System.out.println(rangeSum(nums, n, left, right));

    }
}
