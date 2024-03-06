package arrays;
import java.util.*;

public class BoundaryTraversal {

        //Function to return list of integers that form the boundary
        //traversal of the matrix in a clockwise manner.
        static ArrayList<Integer> boundaryTraversal(int[][] matrix)
        {
            // code here
            int n = matrix.length, m = matrix[0].length;
            ArrayList<Integer> res = new ArrayList<>();

            int startRow = 0, endRow = n - 1, startCol = 0, endCol = m-1;

            for(int i = startRow; i < endCol; i++){
                res.add(matrix[0][i]);

            }
            for(int i = startRow + 1; i < endRow; i++){
                res.add(matrix[i][endCol-1]);

            }
            if(startRow < endRow){
                for(int i = endCol -1; i >= startCol; i--){
                    res.add(matrix[endRow][i]);

                }

            }
            if(startCol < endCol){
                for(int i = endRow - 1; i >= startRow + 1; i--){
                    res.add(matrix[i][startCol]);

                }
            }
            return res;



    }
    public static void main(String[] args) {

        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};


        List<Integer> ans = boundaryTraversal(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }

}
