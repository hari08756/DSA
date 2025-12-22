class Solution {
    public static int sum = 0;
    public TreeNode maxBST(TreeNode root){
        if(root == null) return  null ;
        maxBST(root.right);
        sum += root.val;
        root.val = sum;
        maxBST(root.left);
        return root;
    }
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        if(root == null) return null;
        maxBST(root);
        return root;
    }
}