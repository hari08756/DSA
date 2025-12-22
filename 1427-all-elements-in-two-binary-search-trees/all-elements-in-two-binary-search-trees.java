class Solution {
    public void morrisTrav(TreeNode root, List<Integer> list){
        if(root == null) return;
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }else{
                    pred.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }else{
                list.add(curr.val);
                curr = curr.right;
            }
        }
    }
    public void merge(List<Integer> l1, List<Integer> l2, List<Integer> ans){
        int i = 0, j = 0;
        int n = l1.size(), m = l2.size();
        while(i<n && j<m){
            if(l1.get(i)<l2.get(j)){
                ans.add(l1.get(i++));
            }else{
                ans.add(l2.get(j++));
            }
        }
        while(i<n){
            ans.add(l1.get(i++));
        }
        while(j<m){
            ans.add(l2.get(j++));
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        if(root1 == null && root2 == null) return l1;
        morrisTrav(root1, l1);
        morrisTrav(root2, l2);
        List<Integer> ans = new ArrayList<>();
        merge(l1, l2, ans);
        return ans;
    }
}