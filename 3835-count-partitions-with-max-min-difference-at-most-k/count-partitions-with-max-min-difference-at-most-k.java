class Solution {
    public int countPartitions(int[] nums, int k) {
        final int MOD = 1000000007;
        int n = nums.length;
        
        // dp[i] = ways to partition first i elements
        int[] dp = new int[n + 1];
        // prefix[i] = sum of dp[0] to dp[i]
        int[] prefix = new int[n + 1];
        
        dp[0] = 1;
        prefix[0] = 1;
        
        // TreeMap to maintain sorted window elements (frequency map)
        TreeMap<Integer, Integer> window = new TreeMap<>();
        int left = 1;
        
        for (int right = 1; right <= n; right++) {
            // Add nums[right-1] to window
            window.merge(nums[right-1], 1, Integer::sum);
            
            // Shrink window while max - min > k
            while (!window.isEmpty() && window.lastKey() - window.firstKey() > k) {
                int leftNum = nums[left-1];
                int count = window.merge(leftNum, -1, Integer::sum);
                if (count == 0) {
                    window.remove(leftNum);
                }
                left++;
            }
            
            // Calculate dp[right]: sum of dp[j-1] for all valid j in [left, right]
            int prevSum = (left >= 2) ? prefix[left-2] : 0;
            dp[right] = (int)((prefix[right-1] - prevSum + MOD) % MOD);
            
            // Update prefix sum
            prefix[right] = (int)((prefix[right-1] + dp[right]) % MOD);
        }
        
        return dp[n];
    }
}
