package arrays;

public class sort012 {
    public static void sortColors(int[] nums) {
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i : nums) {
            if (i == 0) {
                count1++;
            } else if (i == 1) {
                count2++;
            } else {
                count3++;
            }
        }

        for (int i = 0; i < count1; i++) nums[i] = 0;
        for (int i = count1; i < count1 + count2; i++) nums[i] = 1;
        for (int i = count1 + count2; i < count1 + count2 + count3; i++) nums[i] = 2;
    }
    public static void main(String args[]) {
        int n = 6;
        int[] arr = {0, 2, 1, 2, 0, 1};
        sortColors(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

    }

}
