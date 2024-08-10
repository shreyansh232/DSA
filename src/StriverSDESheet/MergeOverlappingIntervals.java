package StriverSDESheet;
import java.util.*;

public class MergeOverlappingIntervals {
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
        int[][] a = {{1,4},{4,5}};
        System.out.println(Arrays.deepToString(merge(a)));
    }

}
