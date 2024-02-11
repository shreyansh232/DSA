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

    public static int nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        // Store the entire Pascal's triangle:
        for (int row = 1; row <= n; row++) {
            List<Integer> tempLst = new ArrayList<>(); // temporary list
            for (int col = 1; col <= row; col++) {
                tempLst.add(nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
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
