class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int total = 10;
        int current = 9;
        int available = 9;
        for (int i = 2; i <= n; i++) {
            current *= available;
            total += current;
            available--;
            if (available == 0) break;
        }
        return total;
    }
}