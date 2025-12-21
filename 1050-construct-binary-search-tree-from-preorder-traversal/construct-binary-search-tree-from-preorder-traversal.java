class Solution {
    public static int idx = 0;
    public TreeNode consturctTree(int [] preorder, int bound){
        if(idx == preorder.length || preorder[idx] > bound) return null;
        int val = preorder[idx++];
        TreeNode root = new TreeNode(val);
        root.left = consturctTree(preorder, val);
        root.right = consturctTree(preorder, bound);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        idx = 0;
        return consturctTree(preorder, Integer.MAX_VALUE);
    }
}