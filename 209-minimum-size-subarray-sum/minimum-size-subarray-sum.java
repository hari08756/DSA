class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int minLeng = Integer.MAX_VALUE;
        int sum = 0;
        for(int right = 0; right<n; right++){
            sum += nums[right];
            while(sum>=target){
                minLeng = Math.min(minLeng, right - left+1);
                sum -= nums[left++];
            }
        }
        return minLeng == Integer.MAX_VALUE ? 0: minLeng;
    }
}