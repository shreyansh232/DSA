package Math;
import java.util.*;

public class FindWinnerCircle {
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        int ind = 0;
        while(list.size() > 1){
            ind = (ind + (k-1)) % list.size();
            list.remove(ind);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n, k));
    }
}
