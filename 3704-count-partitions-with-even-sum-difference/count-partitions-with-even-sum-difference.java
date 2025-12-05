class Solution {
    public int countPartitions(int[] nums) {
        int maxCount = 0;
        int leftSum = nums[0];
        int rightSum = 0;
        for(int i = 1; i<nums.length; i++){
            rightSum += nums[i];
        }
        if((leftSum - rightSum) % 2 == 0) maxCount++;
        for(int i = 1; i<nums.length - 1; i++){
            rightSum -= nums[i];
            leftSum += nums[i];
            if((leftSum - rightSum) % 2 == 0) maxCount++;
        }
        return maxCount;
    }
}