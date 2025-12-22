class Solution {
    public void getElement(TreeNode root, List<Integer> ans){
        if(root == null) return;
        getElement(root.left, ans);
        ans.add(root.val);
        getElement(root.right, ans);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        if(root1 == null && root2 == null) return ans;
        getElement(root1, ans);
        getElement(root2, ans);
        Collections.sort(ans);
        return ans;
    }
}