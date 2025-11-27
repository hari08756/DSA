class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        
        // Build prefix sum array
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        
        long maxSum = Long.MIN_VALUE;
        
        // Track minimum prefix sum for each remainder (0 to k-1)
        long[] minPrefix = new long[k];
        for (int j = 0; j < k; j++) {
            minPrefix[j] = Long.MAX_VALUE;
        }
        
        // Initialize: prefix[0] = 0, and 0 % k = 0
        minPrefix[0] = 0;
        
        // Process each position
        for (int i = 1; i <= n; i++) {
            int remainder = i % k;
            
            // If positions have same remainder, subarray between them has length divisible by k
            if (minPrefix[remainder] != Long.MAX_VALUE) {
                maxSum = Math.max(maxSum, prefix[i] - minPrefix[remainder]);
            }
            
            // Update minimum prefix sum for this remainder
            minPrefix[remainder] = Math.min(minPrefix[remainder], prefix[i]);
        }
        
        return maxSum;
    }
}