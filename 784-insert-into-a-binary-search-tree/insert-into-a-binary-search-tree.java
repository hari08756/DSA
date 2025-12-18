class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = new TreeNode(val);
        if(root == null) return temp;
        TreeNode node = root;
        outer : while(root != null){
            if(root.val > val){
                if(root.left == null){
                    root.left = temp;
                    break outer;
                }
                root = root.left;
            }
            if(root.val < val){
                if(root.right == null){
                    root.right = temp;
                    break outer;
                }
                root = root.right;
            }
        }
        return node;
    }
}