class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        for(int i = 0; i<nums.length; i++){
            num.add(nums[i]*nums[i]);
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = num.poll();
        }
        return nums;
    }
}