package arrays;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 1, 1};
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println("Numbers that do not appear in the array: " + result);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Mark positions of encountered numbers
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Find positions that are not marked and add corresponding numbers to the result
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}

