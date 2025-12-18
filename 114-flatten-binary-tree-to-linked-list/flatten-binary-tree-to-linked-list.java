class Solution {
    public TreeNode linkedTree(TreeNode root){
        if(root == null) return root;
        TreeNode leftTree = linkedTree(root.left);
        TreeNode rightTree = linkedTree(root.right);
        if(leftTree != null){
            leftTree.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if(rightTree != null) return rightTree;
        if(leftTree != null) return leftTree;
        return root;
    }
    public void flatten(TreeNode root) {
        linkedTree(root);
    }
}