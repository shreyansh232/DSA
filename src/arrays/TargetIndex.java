package arrays;
import java.util.*;

public class TargetIndex {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int count = 0, lessThan = 0;
        for (int num : nums) {
            if (num == target) count++;
            if (num < target) lessThan++;
        }

        for(int i = 0; i < count; i++){
            res.add(lessThan++);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,3,2};
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }


}
