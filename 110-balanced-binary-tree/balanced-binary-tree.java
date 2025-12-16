class Solution {
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        int d = lh - rh;
        d = Math.abs(d);
        if(d>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}