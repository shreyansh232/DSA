package arrays;
import java.util.*;

public class MaximumDistance {
    public static int maximumDistance(List<List<Integer>> arrays){
        int maxDist = 0;
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);

        for(int i = 1; i < arrays.size(); i++){
            List<Integer> temp = arrays.get(i);
            maxDist = Math.max(maxDist, Math.max(Math.abs(temp.get(temp.size() - 1) - minVal), Math.abs(maxVal - temp.get(0))));

            minVal = Math.min(minVal, temp.get(0));
            maxVal = Math.max(maxVal, temp.get(temp.size() - 1));
        }
        return maxDist;
    }
    public static void main(String[] args) {
        List<List<Integer>> ls = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(1, 2, 3)
        );
        System.out.println(maximumDistance(ls));

    }
}
