class Solution {
    public boolean isValid(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isValid(p.left, q.right) && isValid(p.right, q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(isValid(root.left, root.right)) return true;
        return false;  
    }
}