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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next == null) return head;
        k = k % 501;
        for(int i = 0; i<k; i++){
            ListNode temp1 = head;
            ListNode temp = head.next;
            while(temp.next != null){
                temp1 = temp1.next;
                temp = temp.next;
            }
            temp1.next = null;
            temp.next = head;
            head = temp;
        }
        return head;
    }
}