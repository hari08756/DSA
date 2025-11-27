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
    private static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    private static ListNode doubleLinkedList(ListNode head){
        int carry = 0;
        ListNode temp = head;
        ListNode newNode = new ListNode(0,head);
        ListNode dummy = newNode;
        while(temp != null){
            int mul = 2*temp.val + carry;
            carry = mul /10;
            newNode.next = new ListNode(mul%10);
            newNode = newNode.next;
            temp = temp.next;
        }
        if(carry >0){
            newNode.next = new ListNode(carry);;
            newNode = newNode.next;
        }
        return dummy.next;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode head1 = reverseLinkedList(head);
        ListNode head2 = doubleLinkedList(head1);
        return reverseLinkedList(head2);
    }
}