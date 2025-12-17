class Solution {
    public int height(TreeNode root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public void nthTravrsal(TreeNode root, int i, List<Integer> trav){
        if(root == null || i == 0) return ;
        if(i == 1){
            trav.add(root.val);
        }
        nthTravrsal(root.left, i - 1, trav);
        nthTravrsal(root.right, i - 1, trav);
    }
    public void nthRevTraversal(TreeNode root, int i, List<Integer> trav){
        if(root == null || i == 0) return ;
        if(i == 1){
            trav.add(root.val);
        }
        nthRevTraversal(root.right, i - 1, trav);
        nthRevTraversal(root.left, i - 1, trav);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        for(int i = 1; i <= height(root) + 1; i++){
            List<Integer> trav = new ArrayList<>();
            if(i % 2 != 0){
                nthTravrsal(root, i, trav);
            }else{
                nthRevTraversal(root, i, trav);
            }
            ans.add(trav);
        }        
        return ans;
    }
}