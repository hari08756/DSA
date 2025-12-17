class Solution {
    public int height(TreeNode root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public void nthLevelElement(TreeNode root, int n, List<Integer> listLevel){
        if(root == null) return;
        if(n == 1){
            listLevel.add(root.val);
        }
        nthLevelElement(root.left, n-1, listLevel);
        nthLevelElement(root.right, n-1, listLevel);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        int level = 1 + height(root);
        for(int i = 1; i <= level; i++){
            List<Integer> listLevel = new ArrayList<>();
            nthLevelElement(root, i, listLevel);
            ans.add(listLevel);
        }
        return ans;
    }
}