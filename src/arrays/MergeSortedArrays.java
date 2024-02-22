package arrays;

public class MergeSortedArrays {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1; // Index for nums1
            int j = n - 1; // Index for nums2
            int k = m + n - 1; // Index for the merged array

            // Merge nums1 and nums2 from the end
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }



            // If there are remaining elements in nums2, copy them to nums1
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }
        }

        public static void main(String[] args) {
            // Example usage:
            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int m = 3;
            int[] nums2 = {0,1,2};
            int n = 3;

            merge(nums1, m, nums2, n);

            // Print the merged array
            for (int num : nums1) {
                System.out.print(num + " ");
            }
        }

}
