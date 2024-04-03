package arrays;
import java.util.*;

public class ActivitySelection {


    public static int activitySelection(int start[], int end[], int n) {
        // Base case: If there are no activities, return 0.
        if (n == 0)
            return 0;

        // Combine start and end times into a 2D array for sorting
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }

        // Sort activities based on their end times
        Arrays.sort(activities, (a, b) -> Integer.compare(a[1], b[1]));

        // Select the first activity as the starting point
        int count = 1;
        int prev_end = activities[0][1];

        // Iterate through the sorted activities, selecting non-overlapping activities
        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= prev_end) {
                count++;
                prev_end = activities[i][1];
            }
        }

        return count;
    }

}
