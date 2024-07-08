package Math;
import java.util.*;

public class FindWinnerCircle {
    public static int findTheWinner(int n, int k) {
        //Brute
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            list.add(i);
//        }
//        int ind = 0;
//        while(list.size() > 1){
//            ind = (ind + (k-1)) % list.size();
//            list.remove(ind);
//        }
//        return list.get(0);
        //Better
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            queue.add(i);
        }
        while(queue.size() > 1){
            for(int i = 0; i < k - 1; i++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n, k));
    }
}
