class Solution {
    public void inorder(TreeNode root, ArrayList nums){
        if(root == null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        return nums.get(k-1);
    }
}