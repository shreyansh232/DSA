package Graphs;
import java.util.*;

public class BuildMatrixCondition {
    static int[] toposort(int V, int pairs[][])
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=V;i++){
            adj.add(new ArrayList<>());
        }
        for(int pair[] : pairs){
            int u = pair[0];
            int v = pair[1];
            adj.get(u).add(v);
        }
        // add your code here
        int indegree[] = new int[V+1]; //0
        for(int u=0;u<adj.size();u++){
            for(int v : adj.get(u)){
                indegree[v]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=V;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        //3

        ArrayList<Integer> res = new ArrayList<>();
        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            for(int neighbour : adj.get(node)){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    queue.offer(neighbour);
                }
            }
        }

        if(res.size() != V){
            return new int[0];
        }

        int ans[] = new int[V];
        for(int i=0;i<V;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    public static int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        int[] rowToposort = toposort(k, rowConditions);
        if(rowToposort.length == 0){
            return new int[0][0];
        }
        int[] colToposort = toposort(k, colConditions);
        if(colToposort.length == 0){
            return new int[0][0];
        }
        int[][] res = new int[k][k];
        for(int i = 0; i < k; i++){
            for(int j = 0; j < k; j++){
                if(rowToposort[i] == colToposort[j]){
                    res[i][j] = colToposort[j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] row = {{1,2}, {3,2}};
        int[][] col = {{2,1}, {3,2}};
        int k = 3;
        System.out.println(Arrays.deepToString(buildMatrix(k, row, col)));


    }
}
