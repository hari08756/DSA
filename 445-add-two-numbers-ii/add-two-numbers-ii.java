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
    public ListNode reverseLinkedList(ListNode node){
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public ListNode addTowLinkedList(ListNode l1, ListNode l2){
        int carry = 0;
        int sum = 0;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum %= 10;
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            sum = carry + l1.val;
            carry = sum/10;
            sum %= 10;
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2 != null){
            sum = carry + l2.val;
            carry = sum/10;
            sum %= 10;
            temp.next = new ListNode(sum);
            temp = temp.next;
            l2 = l2.next;
        }
        if(l1 == null && l2 == null){
            if(carry > 0){
                temp.next = new ListNode(carry);
                temp = temp.next;
            }
        }
        return head.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseLinkedList(l1);
        l2 = reverseLinkedList(l2);
        ListNode l = addTowLinkedList(l1,l2);
        return reverseLinkedList(l);
    }
}