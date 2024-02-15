package arrays;
import java.util.*;

public class PolygonPerimeter {

        public long largestPerimeter(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            long sum = 0;
            for (int num : nums) {
                sum += num;
            }
            for (int i = n - 1; i >= 2; i--) {
                if (sum - nums[i] > nums[i]) {
                    return sum;
                }
                sum -= nums[i];
            }
            return -1;
        }

    public static void main(String[] args) {
            int[] nums = {1,2,4,6};
            int ans =

    }
}
