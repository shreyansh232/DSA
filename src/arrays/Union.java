package arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Union {
    public static ArrayList<Integer> union(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> unionArray = new ArrayList<>();
        for (int i : arr1){
            set.add(i);
        }
        for (int i : arr2){
            set.add(i);
        }

        for(int i : set){
            unionArray.add(i);
        }
        return unionArray;



    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> union = union(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : union) {
            System.out.print(val + " ");
        }
}
}
