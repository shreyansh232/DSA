package arrays;

public class majorityElement {
    public static int majorityElement(int[] nums) {
        int cnt = 0; // count
        int element = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                element = nums[i];
            } else if (element == nums[i]) cnt++;
            else cnt--;
        }



        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) cnt1++;
        }

        if (cnt1 > (nums.length / 2)) return element;
        return -1;
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//            if (count > nums.length / 2) {
//                return nums[i];
//            }
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
}
