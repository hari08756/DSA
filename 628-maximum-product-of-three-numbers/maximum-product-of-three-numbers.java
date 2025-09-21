class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        // Compare two possibilities:
        // 1. Product of three largest numbers
        // 2. Product of two smallest (negative) numbers and the largest number
        return Math.max(
            nums[n-1] * nums[n-2] * nums[n-3],  // Three largest
            nums[0] * nums[1] * nums[n-1]        // Two smallest negatives * largest
        );
    }
}