package arrays;
import java.util.*;

public class MergeOverlappingSubarrays {
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (merged.isEmpty() || intervals[i][0] > merged.get(merged.size() - 1)[1]) {
                merged.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], intervals[i][1]);
            }
        }
        return merged.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int[][] mergedIntervals = merge(arr);

        System.out.println("The merged intervals are:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
