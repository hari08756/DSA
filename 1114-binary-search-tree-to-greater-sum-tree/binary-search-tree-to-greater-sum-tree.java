class Solution {
    public int sum;
    public void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }
}