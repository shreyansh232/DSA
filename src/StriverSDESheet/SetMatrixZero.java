package StriverSDESheet;

import java.util.Arrays;

public class SetMatrixZero {

   //Brute
//    public static int[][] setMatrixZero(int[][] matrix){
//        int n = matrix.length;
//        int m = matrix[0].length;
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                if(matrix[i][j] == 0){
//                    row(matrix, n, m, i);
//                    col(matrix, n, m, i);
//                }
//            }
//        }
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                if(matrix[i][j] == -1) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//        return matrix;
//    }
//    public static void row(int[][] matrix, int n, int m, int i) {
//        for (int j = 0; j < m; j++) {
//            if (matrix[i][j] != 0) {
//                matrix[i][j] = -1;
//            }
//        }
//    }
//    public static void col(int[][] matrix, int n, int m, int j) {
//        for (int i = 0; i < m; i++) {
//            if (matrix[i][j] != 0) {
//                matrix[i][j] = -1;
//            }
//        }
//    }

    //Optimal //TC - O(N*M) SC - O(N+M)
    public static int[][] setMatrixZero(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }

            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(Arrays.deepToString(setMatrixZero(matrix)));
    }

}
