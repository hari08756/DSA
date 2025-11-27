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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> visited = new HashSet<>();
        for(int n :nums){
            visited.add(n);
        }
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;
        while(temp.next != null){
            if(visited.contains(temp.next.val)){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return dummy.next;
    }
}