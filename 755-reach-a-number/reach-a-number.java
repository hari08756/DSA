class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target); // symmetry: only absolute matters
        int steps = 0;
        long sum = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            steps++;
            sum += steps;
        }

        return steps;
    }
}
