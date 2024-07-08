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
//        Queue<Integer> queue = new LinkedList<>();
//
//        // Add all participants (numbers 1 to n) to the queue
//        for (int i = 1; i <= n; i++) {
//            queue.add(i);
//        }
//
//        // While there's more than one participant left in the game
//        while (queue.size() > 1) {
//            // Simulate removing participants one by one (k-1 times)
//            for (int i = 0; i < k - 1; i++) {
//                // Move the participant at the front of the queue to the back (simulate skipping)
//                queue.offer(queue.poll());
//            }
//
//            // Remove the participant who loses the round (the one left at the front after skipping)
//            queue.poll();
//        }
//
//        // The remaining participant in the queue is the winner
//        return queue.peek();




        //Optimal
        // Initialize a variable 'ind' to keep track of the winner's position (starting from 0)
        int ind = 0;

        // Loop through all participants except the first one (i starts from 2)
        for (int i = 2; i <= n; i++) {
            // Simulate the elimination process using the mathematical formula
            ind = (ind + k) % i;

            // Explanation of the formula:
            //   - ind: represents the position of the previous winner (0-based indexing)
            //   - k: represents the number of participants to skip
            //   - % i: ensures the result stays within the range of participants (0 to i-1)

            // Imagine a circular list of participants numbered from 0 to n-1.
            // The formula calculates the new position of the winner after each elimination.
            // - It considers the previous winner's position (ind).
            // - It adds the number of participants to skip (k).
            // - The modulo operation (%) ensures the result stays within the valid range (0 to i-1).
            //   - If the result is greater than or equal to the current number of participants (i),
            //     it wraps around to the beginning of the list due to the circular nature.
        }

        // Since the indexing starts from 0, add 1 to get the actual participant number (1-based)
        return ind + 1;
    }




    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n, k));
    }
}
