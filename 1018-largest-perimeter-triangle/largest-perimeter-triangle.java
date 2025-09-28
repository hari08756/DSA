class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = 0;
        for(int i = n-1; i>=2; i--){
            if((nums[i]+nums[i-1]>nums[i-2]) && (nums[i]+nums[i-2]>nums[i-1]) && (nums[i-2]+nums[i-1]>nums[i])){
                max = nums[i]+nums[i-1]+nums[i-2];
                break;
            }
        }
        return max ;
    }
}