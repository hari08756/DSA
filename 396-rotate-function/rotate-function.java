class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long total = 0;
        long F = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
            F += (long) i * nums[i];
        }
        long maxF = F;
        for (int k = 1; k < n; k++) {
            F = F + total - (long) n * nums[n - k];
            if (F > maxF) {
                maxF = F;
            }
        }
        return (int) maxF;
    }
}