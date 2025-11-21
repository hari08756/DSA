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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> nums = new ArrayList<>();
        while(temp!=null){
            nums.add(temp.val);
            temp= temp.next;
        }
        int n = nums.size();
        int [] result = new int [n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<n; i++){
            while(!stack.isEmpty() && nums.get(i) > nums.get(stack.peek())){
                result[stack.pop()] = nums.get(i);
            }
            stack.push(i);
        }
        return result;
    }
}