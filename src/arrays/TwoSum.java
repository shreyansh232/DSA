package arrays;
import java.util.*;


public class TwoSum {
//    public static int[] twoSum(int[] nums, int target) {
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] + nums[j] == target) {
//                    // Return an array containing the indices of the pair
//                    return new int[]{i, j};
//                }
//            }
//        }
//        // Return an array indicating that no such pair is found
//        return new int[]{-1, -1};
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {2, 3, 5, 1, 9};
//        int target = 10;
//        int[] indices = twoSum(nums, target);
//
//        // Check if a valid pair is found
//        if (indices[0] != -1) {
//            System.out.println("Indices of the pair: " + indices[0] + ", " + indices[1]);
//        } else {
//            System.out.println("No such pair found.");
//        }
//    }
//public static int[] twoSum(int[] nums, int target) {
//    int n = nums.length;
//    int[] ans = new int[2];
//    ans[0] = ans[1] = -1;
//    Map<Integer, Integer> map = new HashMap<>();
//    for (int i = 0; i < n; i++){
//        int num = nums[i];
//        int required = target - num;
//        if (map.containsKey(required)){
//            ans[0] = map.get(required);
//            ans[1] = i;
//            return ans;
//        }
//        map.put(nums[i], i);
//    }
//    return ans;
//
//}
//    public static void main(String[] args) {
//        int n = 5;
//        int[] arr = {2, 6, 5, 8, 11};
//        int target = 14;
//        int[] ans = twoSum(arr, target);
//        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
//                + ans[1] + "]");
//
//    }
public static String twoSum(int n, int []arr, int target) {
    Arrays.sort(arr);
    int left = 0, right = n - 1;
    while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == target) {
            return "YES";
        } else if (sum < target) left++;
        else right--;
    }
    return "NO";
}

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);

    }

}
