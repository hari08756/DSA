class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        long sum = 0; // long to prevent overflow

        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }

        return (int)(sum - (long)min * nums.length);
    }
}
