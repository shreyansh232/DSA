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

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) return triangle;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i = 1; i < numRows; i++){
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < i; j++){
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);


        }
        return triangle;
    }

    
}
