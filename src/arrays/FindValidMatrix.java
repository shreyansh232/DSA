package arrays;

import java.util.Arrays;

public class FindValidMatrix {
    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;
        int[][] res = new int[n][m];
        int i = 0, j = 0;
        while (i < n && j < m) {
            int minElement = Math.min(rowSum[i], colSum[j]);
            res[i][j] = minElement;
            rowSum[i] -= minElement;
            colSum[j] -= minElement;

            if (rowSum[i] == 0) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] row = {5,7,10};
        int[] col = {8,6,8};
        System.out.println(Arrays.deepToString(restoreMatrix(row, col)));
    }
}
