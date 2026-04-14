class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
}

class SubtreeOfAnotherTree{
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
           return true;
        }

        if(root == null){
            return false;
        }

        if(root.val == subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        boolean leftAns = isSubtree(root.left, subRoot);
        boolean rightAns = isSubtree(root.right, subRoot);

        return leftAns || rightAns;
    }

    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        else if(root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
           return false;
        }

        return true;
    }
}