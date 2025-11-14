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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode temp1 = head;
        while(temp1.val != val && temp1.next != null ){
            temp1 = temp1.next;
        }

        while(head.val == val && head.next != null){
            head = head.next;
        } 
        if(head.next == null && head.val == val) return null;
        ListNode temp = head;
        while(temp.next != null && temp != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}