package arrays;
import java.util.*;

public class rearrangeArray1 {
//    public int[] rearrangeArray(int[] nums) {
//        int n = nums.length;
//        int [] ans = new int[n];
//        int posIndex = 0, negIndex = 1;
//        for(int i : nums){
//            if(nums[i] > 0){
//                ans[posIndex] = nums[i];
//                posIndex += 2;
//            }
//            else{
//                ans[negIndex] = nums[i];
//                negIndex += 2;
//            }
//        }
//        return ans;
//    }
public static void main(String[] args) {
    // Array Initialization
    int n = 6;
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));

    ArrayList<Integer> ans = RearrangebySign(A, n);

    for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i) + " ");
    }
}

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
        // Define 2 ArrayLists, one for storing positive
        // and other for negative elements of the array.
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Segregate the array into positives and negatives.
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0)
                pos.add(A.get(i));
            else
                neg.add(A.get(i));
        }

        // If positives are lesser than the negatives.
        if (pos.size() < neg.size()) {

            // First, fill array alternatively till the point
            // where positives and negatives are equal in number.
            for (int i = 0; i < pos.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining negatives at the end of the array.
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                A.set(index, neg.get(i));
                index++;
            }
        }

        // If negatives are lesser than the positives.
        else {
            // First, fill array alternatively till the point
            // where positives and negatives are equal in number.
            for (int i = 0; i < neg.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining positives at the end of the array.
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                A.set(index, pos.get(i));
                index++;
            }
        }
        return A;
    }

}
