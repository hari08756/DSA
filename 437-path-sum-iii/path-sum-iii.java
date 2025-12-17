class Solution {
    public void maxPathSum(TreeNode root,long targetSum,int [] maxPath){
        if(root == null) return;
        if(root.val == targetSum) maxPath [0] ++;
        maxPathSum(root.left,targetSum - root.val,maxPath);
        maxPathSum(root.right,targetSum - root.val,maxPath);
    }
    public void helper(TreeNode root, int targetSum,int [] maxPath){
        if(root == null) return;
        maxPathSum(root,(long) targetSum,maxPath);
        helper(root.left,targetSum,maxPath);
        helper(root.right,targetSum,maxPath);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        int [] maxPath = new int [1];
        helper(root,targetSum,maxPath);
        return maxPath[0];
    }
}