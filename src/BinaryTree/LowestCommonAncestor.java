package BinaryTree;

import javax.swing.tree.TreeNode;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        if(leftNode == null){
            return rightNode;
        } else if(rightNode == null){
            return leftNode;
        }else{
            return root;
        }


    }

}
