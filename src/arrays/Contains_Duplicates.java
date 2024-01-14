package arrays;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicates {
    public static boolean dup(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            if (!set.add(i)){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,6};
        System.out.println(dup(arr));
    }
}
