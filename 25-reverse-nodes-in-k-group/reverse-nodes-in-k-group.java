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
    private ListNode reverseLinkedList(ListNode head, int n){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null && n>0){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
            n--;
        }
        head.next = curr;
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        ListNode temp = head;
        int n = k;
        while(temp != null && k>0){
            temp = temp.next;
            k--;
        }
        if(k>0) return head;
        
        ListNode newhead = reverseLinkedList(head,n);
        head.next = reverseKGroup(head.next,n);
        return newhead;
    }
}