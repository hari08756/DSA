class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for(int i = 0; i<n; i++){
            int k = ((i+1)*(n-i)+1)/2;
            totalSum += k*arr[i];
        }
        return totalSum;
    }
}