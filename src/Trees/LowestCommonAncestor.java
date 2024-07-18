//package Trees;
//public class LowestCommonAncestor {
//    public static TreesDS.TreeNode lowestCommonAncestor(TreesDS.TreeNode root, TreesDS.TreeNode p, TreesDS.TreeNode q) {
//        if(root == null || root == p || root == q){
//            return root;
//        }
//        TreesDS.TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
//        TreesDS.TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
//        if(leftNode == null){
//            return rightNode;
//        } else if(rightNode == null){
//            return leftNode;
//        }else{
//            return root;
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        TreesDS.TreeNode<Integer> root =
//    }
//
//}
