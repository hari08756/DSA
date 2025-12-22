class Solution {
    public static int minDiff;
    public static TreeNode prev;
    public void minDiffInBst(TreeNode root){
        if(root == null) return;
        minDiffInBst(root.left);
        if(prev != null){
            minDiff = Math.min(minDiff, Math.abs(root.val - prev.val));
        }
        prev = root;
        minDiffInBst(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        minDiff = Integer.MAX_VALUE;
        prev = null;
        minDiffInBst(root);
        return minDiff;
    }
}