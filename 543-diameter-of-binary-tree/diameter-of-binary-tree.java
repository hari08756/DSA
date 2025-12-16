class Solution {
    public int level(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);
        int mid = level(root.left) + level(root.right);
        return Math.max(leftAns,Math.max(rightAns, mid));
    }
}