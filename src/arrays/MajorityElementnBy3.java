package arrays;
import java.util.*;

public class MajorityElementnBy3 {

    //comitting this yee haw.....
//    public static List<Integer> majorityElement(int []v) {
//        int n = v.length; //size of the array
//        List<Integer> ls = new ArrayList<>(); // list of answers
//
//
//
//        for (int i = 0; i < n; i++) {
//            //selected element is v[i]:
//            // Checking if v[i] is not already
//            // a part of the answer:
//            if (ls.isEmpty() || ls.get(0) != v[i]) {
//                int cnt = 0;
//                for (int j = 0; j < n; j++) {
//                    // counting the frequency of v[i]
//                    if (v[j] == v[i]) {
//                        cnt++;
//
//                    }
//                }
//
//
//
//                // check if frquency is greater than n/3:
//                if (cnt > (n / 3))
//                    ls.add(v[i]);
//            }
//
//            if (ls.size() == 2) break;
//        }
//
//        return ls;
//    }
//
//    public static void main(String args[]) {
//        int[] arr = {11, 33, 33, 11, 33, 11};
//        List<Integer> ans = majorityElement(arr);
//        System.out.print("The majority elements are: ");
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.print(ans.get(i) + " ");
//        }
//        System.out.println();
    public static List<Integer> majorityElement(int []v) {
        int n = v.length; //size of the array
        List<Integer> ls = new ArrayList<>(); // list of answers

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // least occurrence of the majority element:
        int mini = (int)(n / 3) + 1;

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);

            //checking if v[i] is
            // the majority element:
            if (mpp.get(v[i]) == mini) {
                ls.add(v[i]);
            }
            if (ls.size() == 2) break;
        }

        return ls;
    }

    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    }

}
