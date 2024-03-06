package arrays;
import java.util.*;

public class BoundaryTraversal {

        //Function to return list of integers that form the boundary
        //traversal of the matrix in a clockwise manner.
        static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
        {
            // code here
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

}
