package Stacks;
import java.util.*;
public class RobotsCollision {
    public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indexes = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return positions[a] - positions[b];
            }

        });
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int index : indexes) {
            if (directions.charAt(index) == 'R') {
                stack.push(index);
            } else {
                boolean isSurvive = true;
                while (!stack.isEmpty()) {
                    int topIndex = stack.peek();
                    if (directions.charAt(topIndex) == 'L') {
                        isSurvive = true;
                        break;
                    } else if (healths[topIndex] > healths[index]) {
                        isSurvive = false;
                        healths[index] = 0;
                        healths[topIndex] -= 1;
                        break;
                    } else if (healths[index] > healths[topIndex]) {
                        isSurvive = true;
                        healths[topIndex] = 0;
                        healths[index] -= 1;
                        stack.pop();

                    } else {
                        isSurvive = false;
                        healths[topIndex] = 0;
                        healths[index] = 0;
                        stack.pop();
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                res.add(healths[i]);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] x = {5,4,3,2,1};
        int[] y = {2,17,9,15,10};
        String z = "RRRRR";
        System.out.println(survivedRobotsHealths(x,y,z));
    }
}
