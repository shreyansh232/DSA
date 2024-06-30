package StriverSDESheet;
import java.util.*;

public class PascalTriangle {
    // TC - O(n*n) SC - 0(n*n)
    public static List<List<Integer>> triangle(int n){
        List<List<Integer>> ans  = new ArrayList<>();
        for(int row = 0; row < n; row++){
            ans.add(generateRows(row));
        }
        return ans;

    }
    public static List<Integer> generateRows(int row){
        List<Integer> rows = new ArrayList<>();
        long res = 1;
        for(int i = 0; i <= row; i++){
            rows.add((int)res);
            res = res * (row - i);
            res = res / (i + 1);
        }
        return rows;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(triangle(n));
    }

}
