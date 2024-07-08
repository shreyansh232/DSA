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
        // Create a queue to simulate the circular list of participants (numbered 1 to n)
        Queue<Integer> queue = new LinkedList<>();

        // Add all participants (numbers 1 to n) to the queue
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        // While there's more than one participant left in the game
        while (queue.size() > 1) {
            // Simulate removing participants one by one (k-1 times)
            for (int i = 0; i < k - 1; i++) {
                // Move the participant at the front of the queue to the back (simulate skipping)
                queue.offer(queue.poll());
            }

            // Remove the participant who loses the round (the one left at the front after skipping)
            queue.poll();
        }

        // The remaining participant in the queue is the winner
        return queue.peek();
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n, k));
    }
}
