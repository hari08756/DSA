class Solution {
    public boolean isSelfCrossing(int[] x) {
        int n = x.length;
        if (n < 4) return false;
        for (int i = 3; i < n; i++) {
            if (x[i] >= x[i-2] && x[i-1] <= x[i-3]) return true;
            if (i >= 4) {
                if (x[i-1] == x[i-3] && x[i] + x[i-4] >= x[i-2]) return true;
            }
            if (i >= 5) {
                if (x[i-2] >= x[i-4] && x[i-3] >= x[i-1] && x[i-1] + x[i-5] >= x[i-3] && x[i] + x[i-4] >= x[i-2])
                    return true;
            }
        }
        return false;
    }
}