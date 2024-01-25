package arrays;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicates2 {
    public static boolean containsDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;


    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,6};
        int k = 3;
        System.out.println(containsDuplicate(arr, k));

    }

}
