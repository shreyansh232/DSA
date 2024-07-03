package StriverSDESheet;

import java.util.Arrays;

public class RotateMatrix {
    public static int[][] rotate(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        //First transpose, columns becomes rows
        for(int i = 0; i < n; i++){
            for(int j = i; j < m; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Now, reverse the rows
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][m - 1 - j];
                matrix[i][m - 1 - j] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.deepToString(rotate(matrix)));
    }

}
