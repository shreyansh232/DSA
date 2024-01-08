package arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Union {
//    public static ArrayList<Integer> union(int[] arr1, int[] arr2){
//        Set<Integer> set = new HashSet<>();
//        ArrayList<Integer> unionArray = new ArrayList<>();
//        for (int i : arr1){
//            set.add(i);
//        }
//        for (int i : arr2){
//            set.add(i);
//        }
//
//        for(int i : set){
//            unionArray.add(i);
//        }
//        return unionArray;
//
//
//
//    }
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
//        ArrayList<Integer> union = union(arr1, arr2);
//        System.out.println("Union of arr1 and arr2 is ");
//        for (int val : union) {
//            System.out.print(val + " ");
//        }
//}
    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.isEmpty()|| Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.isEmpty() || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
    public static void main (String[] args){
        int n = 10, m = 7;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = union(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }
}
