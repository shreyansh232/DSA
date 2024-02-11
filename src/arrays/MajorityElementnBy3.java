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
//    public static List<Integer> majorityElement(int []v) {
//        int n = v.length; //size of the array
//        List<Integer> ls = new ArrayList<>(); // list of answers
//
//        //declaring a map:
//        HashMap<Integer, Integer> mpp = new HashMap<>();
//
//        // least occurrence of the majority element:
//        int mini = (int)(n / 3) + 1;
//
//        //storing the elements with its occurnce:
//        for (int i = 0; i < n; i++) {
//            int value = mpp.getOrDefault(v[i], 0);
//            mpp.put(v[i], value + 1);
//
//            //checking if v[i] is
//            // the majority element:
//            if (mpp.get(v[i]) == mini) {
//                ls.add(v[i]);
//            }
//            if (ls.size() == 2) break;
//        }
//
//        return ls;
//    }

        public static List<Integer> majorityElement(int[] nums) {
            int n = nums.length;
            int cnt1 = 0, cnt2 = 0;
            int ele1 = Integer.MIN_VALUE;
            int ele2 = Integer.MIN_VALUE;

            // First pass to find potential candidates
            for(int i = 0; i < n; i++){
                if(cnt1 == 0 && ele2 != nums[i]){
                    cnt1 = 1;
                    ele1 = nums[i];
                }
                else if(cnt2 == 0 && ele1 != nums[i]){
                    cnt2 = 1;
                    ele2 = nums[i];
                }
                else if(ele1 == nums[i]) cnt1++;
                else if(ele2 == nums[i]) cnt2++;
                else{
                    cnt1--;
                    cnt2--;
                }
            }

            // Second pass to count occurrences
            cnt1 = 0; cnt2 = 0;
            for(int i = 0; i < n; i++){
                if(nums[i] == ele1) cnt1++;
                else if(nums[i] == ele2) cnt2++;
            }

            List<Integer> result = new ArrayList<>();
            int min = (int)(n/3)+1;
            if (cnt1 >= min) result.add(ele1);
            if (cnt2 >= min) result.add(ele2);

            return result;
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
