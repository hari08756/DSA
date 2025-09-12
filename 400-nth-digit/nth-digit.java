class Solution {
    public int findNthDigit(int n) {
        long N = n;            // work with long to avoid overflow
        long digits = 1;       // length of numbers in current range
        long count = 9;        // how many numbers in this range
        long start = 1;        // starting number of this range

        // Step 1: locate the digit length group
        while (N > digits * count) {
            N -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }

        // Step 2: find the actual number that contains the nth digit
        long index = (N - 1) / digits; 
        long number = start + index;

        // Step 3: find the digit inside that number
        int digitIndex = (int)((N - 1) % digits);
        String s = Long.toString(number);

        return s.charAt(digitIndex) - '0';
    }
}
