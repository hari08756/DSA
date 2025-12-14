class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int [] prefSum = new int[n];
        prefSum [0] = nums[0];
        int minSum = 0;
        minSum = Math.min(minSum, prefSum[0]);
        for(int i = 1; i<n; i++){
            prefSum[i] = prefSum[i-1] + nums[i];
            minSum = Math.min(minSum,prefSum[i]);
        }
        if(minSum < 0) minSum = -minSum;
        return minSum +1;
    }
}