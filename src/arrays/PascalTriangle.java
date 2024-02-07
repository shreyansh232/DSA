package arrays;

import java.util.*;

public class PascalTriangle {
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        for (int i = 0; i < numRows; i++) {
//            List<Integer> row = new ArrayList<>();
//
//            for (int j = 0; j <= i; j++) {
//                // Calculate binomial coefficient C(i, j) using dynamic programming
//                int coef = (j == 0 || j == i) ? 1 : row.get(j - 1) * (i - j + 1) / j;
//                row.add(coef);
//            }
//
//            result.add(row);
//        }
//
//        return result;
//
//
//
//    }

//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> triangle = new ArrayList<>();
//        if(numRows == 0) return triangle;
//        List<Integer> firstRow = new ArrayList<>();
//        firstRow.add(1);
//        triangle.add(firstRow);
//        for(int i = 1; i < numRows; i++){
//            List<Integer> prevRow = triangle.get(i-1);
//            List<Integer> row = new ArrayList<>();
//            row.add(1);
//            for(int j = 1; j < i; j++){
//                row.add(prevRow.get(j-1) + prevRow.get(j));
//            }
//            row.add(1);
//            triangle.add(row);
//
//
//        }
//        return triangle;
//    }

    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); //inserting the 1st element

        //calculate the rest of the elements:
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        //store the entire pascal's triangle:
        for (int row = 1; row <= n; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    
}
