package arrays;

public class CountNumberTeams {
        public static int numTeams(int[] rating) {
            // Get the length of the array
            int n = rating.length;
            // Initialize count to keep track of the number of teams
            int count = 0;

            // Iterate through each middle element in the array
            for (int mid = 1; mid < n - 1; mid++) {
                // Count elements to the left of 'mid' that are smaller than rating[mid]
                int leftSmallerCount = 0;
                for (int i = 0; i < mid; i++) {
                    if (rating[i] < rating[mid]) {
                        leftSmallerCount++;
                    }
                }

                // Count elements to the right of 'mid' that are greater than rating[mid]
                int rightGreaterCount = 0;
                for (int i = mid; i < n; i++) {
                    if (rating[i] > rating[mid]) {
                        rightGreaterCount++;
                    }
                }

                // Increment count by the product of leftSmallerCount and rightGreaterCount
                count += leftSmallerCount * rightGreaterCount;

                // Calculate elements to the left of 'mid' that are greater than rating[mid]
                int leftGreaterCount = mid - leftSmallerCount;
                // Calculate elements to the right of 'mid' that are smaller than rating[mid]
                int rightSmallerCount = n - mid - 1 - rightGreaterCount;

                // Increment count by the product of leftGreaterCount and rightSmallerCount
                count += leftGreaterCount * rightSmallerCount;
            }

            // Return the total count of valid teams
            return count;
        }
    public static void main(String[] args) {
        int[] x = {2,5,3,6,4};
        System.out.println(numTeams(x));
    }
}
