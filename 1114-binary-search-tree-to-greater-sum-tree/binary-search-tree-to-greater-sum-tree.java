class Solution {
    public static int sum;
    public void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        traverse(root);
        return root;
    }
}