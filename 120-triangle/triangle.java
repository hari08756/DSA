class Solution {
   public int minimumTotal(List<List<Integer>> triangle) {
    int n = triangle.size();
    // Copy last row as the starting dp array
    int[] dp = new int[n];
    for (int i = 0; i < n; i++)
        dp[i] = triangle.get(n - 1).get(i);
    
    // Build the dp array from bottom up
    for (int r = n - 2; r >= 0; r--) {
        for (int i = 0; i <= r; i++) {
            dp[i] = triangle.get(r).get(i) + Math.min(dp[i], dp[i + 1]);
        }
    }
    // The result will be at dp[0]
    return dp[0];
}

}