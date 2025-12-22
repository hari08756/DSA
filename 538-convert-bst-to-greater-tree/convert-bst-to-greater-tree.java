class Solution {
    public static int sum = 0;
    public void maxBST(TreeNode root){
        if(root == null) return ;
        maxBST(root.right);
        sum += root.val;
        root.val = sum;
        maxBST(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        maxBST(root);
        return root;
    }
}