class Solution {
    public void traverse(TreeNode root, int [] sum ){
        if(root == null) return;
        traverse(root.right, sum);
        sum[0] += root.val;
        root.val = sum[0];
        traverse(root.left, sum);
    }
    public TreeNode bstToGst(TreeNode root) {
        int [] sum = new int [1];
        sum [0] = 0;
        traverse(root, sum);
        return root;
    }
}