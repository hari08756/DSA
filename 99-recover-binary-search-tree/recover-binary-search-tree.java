class Solution {
    public void recoverTree(TreeNode root) {
        TreeNode curr = root;
        TreeNode prev1 = null;
        TreeNode prev2 = null;
        List<TreeNode> arr = new ArrayList<>();
        while(curr != null){
            if(curr.left != null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr) pred = pred.right;
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }else{
                    pred.right = null;
                    if(prev1 != null && prev2 != null){
                        if(prev1.val > curr.val && prev1.val > prev2.val) arr.add(prev1);
                        if(prev1.val < curr.val && prev1.val < prev2.val) arr.add(prev1);
                    }else 
                        if(prev1 != null && prev1.val > curr.val) arr.add(prev1);
                    prev2 = prev1;
                    prev1 = curr;
                    curr = curr.right;
                }
            }else{
                if(prev1 != null && prev2 != null){
                    if(prev1.val > curr.val && prev1.val > prev2.val) arr.add(prev1);
                    if(prev1.val < curr.val && prev1.val < prev2.val) arr.add(prev1);
                }else 
                    if(prev1 != null && prev1.val > curr.val) arr.add(prev1);
                prev2 = prev1;
                prev1 = curr;
                curr = curr.right;
            }
        }
        if(prev2.val > prev1.val) arr.add(prev1);
        TreeNode first = arr.get(0);
        TreeNode second = arr.get(arr.size() - 1);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}