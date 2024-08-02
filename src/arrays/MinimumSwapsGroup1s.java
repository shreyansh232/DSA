package arrays;

public class MinimumSwapsGroup1s {
    public static int minSwaps(int[] nums) {
        int window = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                window++;
            }
        }
        int currZeros = 0;
        for (int i = 0; i < window; i++) {
            if (nums[i] == 0) {
                currZeros++;
            }
        }
        int minZeros = currZeros;
        int start = 0, end = window - 1;
        while (start < n) {
            if (nums[start] == 0) {
                currZeros--;
            }
            start++;
            end++;
            if (nums[end % n] == 0) {
                currZeros++;
            }
            minZeros = Math.min(minZeros, currZeros);
        }
        return minZeros;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1,1};
        System.out.println(minSwaps(nums));

    }
}
