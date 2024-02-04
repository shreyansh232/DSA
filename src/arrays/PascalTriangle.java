package arrays;

import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // Calculate binomial coefficient C(i, j) using dynamic programming
                int coef = (j == 0 || j == i) ? 1 : row.get(j - 1) * (i - j + 1) / j;
                row.add(coef);
            }

            result.add(row);
        }

        return result;



    }

    
}
