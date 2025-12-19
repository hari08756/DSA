class Solution {
    public TreeNode delete(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val > key){
            TreeNode l = root.left;
            if(l == null) return null;
            if(l.val == key){
                // Zero child
                if(l.left == null && l.right == null) root.left = null;
                //One child
                else if(l.left == null || l.right == null){
                    if(l.left == null) root.left = l.right;
                    else root.left = l.left;
                }
                // Two child
                else{
                    TreeNode curr = l;
                    TreeNode pred = l.left;
                    while(pred.right != null) pred = pred.right;
                    delete(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
            }
            else delete(root.left, key);
        }else{
            TreeNode r = root.right;
            if(r == null) return null;
            if(r.val == key){
                // Zero child
                if(r.left == null && r.right == null) root.right = null;
                //One child
                else if(r.left == null || r.right == null){
                    if(r.left == null) root.right = r.right;
                    else root.right = r.left;
                }
                // Two child
                else{
                    TreeNode curr = r;
                    TreeNode pred = r.right;
                    while(pred.left != null) pred = pred.left;
                    delete(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
            }
            else delete(root.right, key);
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        TreeNode temp = new TreeNode(Integer.MAX_VALUE);
        temp.left = root;
        delete(temp, key);
        return temp.left;
    }
}