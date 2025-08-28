class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if (target == 0) {
            return true;
        }
        if (x == 0 && y == 0) {
            return false;
        }
        if (target > x + y) {
            return false;
        }
        int g = gcd(x, y);
        return target % g == 0;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}