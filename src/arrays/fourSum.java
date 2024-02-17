package arrays;
import java.util.*;

public class fourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;

        // check all possible triplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for(int a = k + 1; a < n; a++){
                        if (nums[i] + nums[j] + nums[k] + nums[a] == target) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[a]);
                            temp.sort(null);
                            st.add(temp);
                        }
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int target = 0;
        List<List<Integer>> ans = fourSum(arr, target);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
