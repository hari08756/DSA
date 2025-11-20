class Solution {
    public int findMin(int[] nums) {
        for(int i = 0 , min = nums[0]; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            if(i == nums.length-1) return min;
        }
        return -1;
    }
}