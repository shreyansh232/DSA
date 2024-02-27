package arrays;
import java.util.*;

public class TargetIndex {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int count = 0, lessThan = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) count++;
            if(nums[i] < target) lessThan++;
        }

        for(int i = 0; i < count; i++){
            res.add(lessThan++);
        }
        return res;

    }

}
