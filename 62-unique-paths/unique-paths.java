class Solution {
    public int uniquePaths(int m, int n) {
        int total = m + n - 2;
        int k = Math.min(m - 1, n - 1);
        long ans = 1;
        for (int i = 1; i <= k; i++) {
            ans = ans * (total - i + 1) / i;
        }
        return (int) ans;
    }
}