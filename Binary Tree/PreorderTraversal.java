import java.util.*;

class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
}

class PreorderTraversal{
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    public void preorder(TreeNode root, List<Integer> list){
         if(root == null) return;

         list.add(root.val);
         preorder(root.left, list);
         preorder(root.right, list);
    }
}