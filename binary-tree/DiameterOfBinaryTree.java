class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
}

class DiameterOfBinaryTree{
    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
         return helper(root).diam;
    }

    public Info helper(TreeNode root){
        if(root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = helper(root.left);
        Info rightInfo = helper(root.right);
 
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }     
}