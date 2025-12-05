/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode recList(ListNode temp, ListNode head){
        if(temp == null || temp.next == null) return head;
        int t = temp.val;
        temp.val = temp.next.val;
        temp.next.val = t;
        return recList(temp.next.next, head);
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        return recList(head,head);
    }
}