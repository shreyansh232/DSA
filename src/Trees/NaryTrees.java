package Trees;
import java.util.*;

public class NaryTrees {
    public class TreeNode<E>{
        E data;
        ArrayList<TreeNode> children;
        public TreeNode(E data){
            this.data = data;
            children = new ArrayList<>();
        }
    }
    public ArrayList<Integer> BFS(TreeNode<Integer> root){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode<Integer> node = queue.poll();
            res.add(node.data);
            for(TreeNode child : node.children){
                if(child != null){
                    queue.offer(child);
                }
            }

        }
        return res;

    }
}
