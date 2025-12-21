class Solution {
    private TreeNode constructTree(ListNode head, ListNode stop){
        if(head == stop) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != stop && fast.next != stop){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = constructTree(head,slow);
        root.right = constructTree(slow.next, stop);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return constructTree(head,null);
    }
}