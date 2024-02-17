package arrays;
import java.util.*;

public class ThreeSum {
    //Brute
//    public static List<List<Integer>> triplet(int n, int[] arr) {
//        Set<List<Integer>> st = new HashSet<>();
//
//        // check all possible triplets:
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    if (arr[i] + arr[j] + arr[k] == 0) {
//                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
//                        temp.sort(null);
//                        st.add(temp);
//                    }
//                }
//            }
//        }
//
//        // store the set elements in the answer:
//        List<List<Integer>> ans = new ArrayList<>(st);
//        return ans;
//    }
    public static List<List<Integer>> triplet(int n, int[] arr) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                //Calculate the 3rd element:
                int third = -(arr[i] + arr[j]);

                //Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
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
